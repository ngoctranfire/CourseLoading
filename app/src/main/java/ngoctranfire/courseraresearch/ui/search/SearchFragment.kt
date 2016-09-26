package ngoctranfire.courseraresearch.ui.search

import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ngoctranfire.courseraresearch.R
import ngoctranfire.courseraresearch.model.courses.CourseData
import timber.log.Timber

/**
 * Created by ngoctranfire on 9/11/16.
 */
class SearchFragment: Fragment(), SearchContract.View {


    lateinit private var presenter: SearchContract.Presenter
    lateinit private var catalogAdapter: CatalogResultsAdapter

    companion object {
        fun newInstance(): SearchFragment {
            val searchFragment = SearchFragment()
            return searchFragment
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        Timber.d("onCreate()")
        super.onCreate(savedInstanceState)
        catalogAdapter = CatalogResultsAdapter(context, mutableListOf())

    }

    override fun setPresenter(presenter: SearchContract.Presenter) {
       this.presenter = presenter
    }

    override fun showCourseList(courseData: List<CourseData>) {
        catalogAdapter.updateCourseList(courseData)
    }

    override fun onResume() {
        Timber.d("onResume()")
        super.onResume()
        presenter.subscribe()
    }

    override fun onPause() {
        Timber.d("onPause()")
        super.onPause()
        presenter.unsubscribe()
    }

    override fun onCreateView(layoutInflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View? {
        val root = layoutInflater.inflate(R.layout.fragment_search, container, false)
        val recyclerView = root.findViewById(R.id.search_list) as RecyclerView
        recyclerView.adapter = catalogAdapter
        recyclerView.setHasFixedSize(true)

        return root

    }

}