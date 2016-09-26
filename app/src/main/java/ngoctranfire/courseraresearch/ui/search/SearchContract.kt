package ngoctranfire.courseraresearch.ui.search

import android.support.v7.widget.SearchView
import ngoctranfire.courseraresearch.model.courses.CourseData
import ngoctranfire.courseraresearch.model.courses.SearchResults
import ngoctranfire.courseraresearch.ui.BasePresenter
import ngoctranfire.courseraresearch.ui.BaseView
import rx.Observable

/**
 * Created by ngoctranfire on 9/11/16.
 */
interface SearchContract {
    interface View : BaseView<Presenter> {
        fun showCourseList(courseData: List<CourseData>)
    }

    interface Presenter: BasePresenter {
        fun observeSearchResults(searchString: Observable<String>)
    }
}