package ngoctranfire.courseraresearch

import android.app.Application
import com.facebook.stetho.Stetho
import io.realm.RealmConfiguration
import ngoctranfire.courseraresearch.dagger.components.AppComponent
import ngoctranfire.courseraresearch.dagger.components.DaggerAppComponent
import ngoctranfire.courseraresearch.dagger.modules.AppModule
import ngoctranfire.courseraresearch.logs.CourseraSearchLogTree
import timber.log.Timber

/**
 * Created by ngoctranfire on 8/20/16.
 */

class CourseraSearchApp : Application() {
    companion object {
        @JvmStatic lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        Timber.plant(getTimberTree())
        appComponent = DaggerAppComponent
            .builder()
            .appModule(getAppModule())
            .build()

    }

    private fun getAppModule(): AppModule {
        return AppModule(this, getRealmConfiguration())
    }
    private fun getTimberTree(): Timber.Tree {
        return CourseraSearchLogTree()
    }

    private fun getRealmConfiguration(): RealmConfiguration {
        return RealmConfiguration.Builder(this)
            .name(this.getString(R.string.app_name))
            .deleteRealmIfMigrationNeeded()
            .schemaVersion(1)
            .build()
    }
}