package ngoctranfire.courseraresearch.dagger.components

import dagger.Component
import ngoctranfire.courseraresearch.dagger.modules.AppModule
import ngoctranfire.courseraresearch.dagger.modules.HttpModule
import ngoctranfire.courseraresearch.dagger.scopes.AppScope
import ngoctranfire.courseraresearch.ui.search.SearchActivity

/**
 * Created by ngoctranfire on 8/20/16.
 */
@AppScope
@Component(modules = arrayOf(
        AppModule::class,
        HttpModule::class
))
interface AppComponent {


    fun inject(searchActivity: SearchActivity)
}