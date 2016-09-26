package ngoctranfire.courseraresearch.ui.search

import android.app.SearchManager
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.SearchView
import android.support.v7.widget.Toolbar
import android.view.Menu
import ngoctranfire.courseraresearch.CourseraSearchApp
import ngoctranfire.courseraresearch.R
import ngoctranfire.courseraresearch.api.CatalogResultsApi
import ngoctranfire.courseraresearch.util.ActivityUtils
import retrofit2.Retrofit
import rx.Observable
import timber.log.Timber
import javax.inject.Inject

class SearchActivity : AppCompatActivity() {

    lateinit private var toolBar: Toolbar
    lateinit private var catalogService: CatalogResultsApi
    lateinit private var searchPresenter: SearchPresenter
    @Inject lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        CourseraSearchApp.appComponent.inject(this)
        setContentView(R.layout.activity_search)
        Timber.d("onCreate()")

        this.toolBar = findViewById(R.id.tool_bar) as Toolbar
        setSupportActionBar(this.toolBar)

        var searchFragment: SearchFragment? = supportFragmentManager?.findFragmentById(R.id.search_fragment) as SearchFragment?

        if (searchFragment == null) {
            // Create the fragment
            Timber.d("Search fragment has been created!")
            searchFragment = SearchFragment.newInstance()
            ActivityUtils.addFragmentToActivity(supportFragmentManager, searchFragment, R.id.search_fragment)
        }

        // Create the presenter
        catalogService = retrofit.create(CatalogResultsApi::class.java)
        searchPresenter = SearchPresenter(searchFragment, catalogService)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        super.onCreateOptionsMenu(menu)
        Timber.d("onCreateOptionsMenu")

        // Inflate the options menu from XML
        menuInflater.inflate(R.menu.options_menu, menu)
        val searchManager: SearchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val searchView: SearchView = menu.findItem(R.id.action_search).actionView as SearchView
        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName))
        searchView.setIconifiedByDefault(false)

        searchPresenter.subscribe()
        searchPresenter.observeSearchResults(searchObservable(searchView))
        return true
    }

    private fun searchObservable(searchView: SearchView): Observable<String> {
        return  Observable.create({ subscriber ->
            searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener {
                override fun onQueryTextChange(newText: String?): Boolean {
                    newText?.apply {
                        subscriber.onNext(newText)
                    }
                    return true
                }

                override fun onQueryTextSubmit(query: String?): Boolean {
                    return true
                }
            })
        })
    }

}
