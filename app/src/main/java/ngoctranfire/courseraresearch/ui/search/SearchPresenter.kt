package ngoctranfire.courseraresearch.ui.search

import android.support.v4.util.ArrayMap
import ngoctranfire.courseraresearch.api.CatalogResultsApi
import ngoctranfire.courseraresearch.model.courses.CourseData
import ngoctranfire.courseraresearch.model.courses.SearchResults
import ngoctranfire.courseraresearch.util.CoursesUtil
import rx.Observable
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import rx.subscriptions.CompositeSubscription
import timber.log.Timber
import java.util.concurrent.TimeUnit

/**
 * Created by ngoctranfire on 9/11/16.
 */

class SearchPresenter(val searchView: SearchContract.View,
                      val searchApi: CatalogResultsApi) : SearchContract.Presenter {
    private var lastSearchedText: String = ""
    lateinit private var subscriptions: CompositeSubscription

    init {
        subscriptions = CompositeSubscription()
        searchView.setPresenter(this)
    }

    override fun subscribe() {
        // no-op
    }

    override fun unsubscribe() {
        subscriptions.clear()
    }

    override fun observeSearchResults(searchString: Observable<String>) {
        val subscription = searchString
        .onBackpressureLatest()
        .subscribeOn(Schedulers.io())
        .debounce(1, TimeUnit.SECONDS)
        .observeOn(Schedulers.io())
        .filter{ s ->
            lastSearchedText != s
        }
        .switchMap { s ->
            lastSearchedText = s
            val queryMap: Map<String, String> = mapOf("fields" to
                    "courseId,onDemandSpecializationId,courses.v1(name,photoUrl,partnerIds),onDemandSpecializations.v1(name,logo,courseIds,partnerIds),partners.v1(name)",
                    "includes" to "courseId,onDemandSpecializationId,courses.v1(partnerIds)",
                    "query" to s,
                    "q" to "search")
            searchApi.searchCourses(queryMap)
        }
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(object: Observer<SearchResults> {
            override fun onError(e: Throwable?) {
                e?.printStackTrace()
            }

            override fun onNext(t: SearchResults) {
                searchView.showCourseList(processSearchResults(t))
            }

            override fun onCompleted() {
            }

        })
        subscriptions.add(subscription)
    }

    private fun processSearchResults(searchResults: SearchResults): List<CourseData> {
        val courses = searchResults.linked.coursesV1
        val specialializations = searchResults.linked.onDemandSpecializationsV1
        Timber.d(" Specializations =" + specialializations.toString())
        val partnersMap: ArrayMap<String, String> = CoursesUtil.getPartnerUniversityHashMap(searchResults.linked.partnersV1)
        val courseDataList: MutableList<CourseData> = mutableListOf()

        for(i in specialializations.indices) {
            var courseData = CourseData()
            courseData.courseName = specialializations[i].name
            courseData.universities = CoursesUtil.partnersToString(courses[i].partnerIds, partnersMap)
            courseData.imageUrl = specialializations[i].logo
            courseData.coursesCount = specialializations[i].courseIds.size
            courseDataList.add(courseData)
        }

        for(i in courses.indices) {
            var courseData = CourseData()
            courseData.courseName = courses[i].name
            courseData.universities = CoursesUtil.partnersToString(courses[i].partnerIds, partnersMap)
            courseData.imageUrl = courses[i].photoUrl
            courseDataList.add(courseData)
        }

        return courseDataList
    }





}
