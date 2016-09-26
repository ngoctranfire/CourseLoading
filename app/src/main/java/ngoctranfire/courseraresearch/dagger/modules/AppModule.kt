package ngoctranfire.courseraresearch.dagger.modules

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import io.realm.Realm
import io.realm.RealmConfiguration
import ngoctranfire.courseraresearch.dagger.scopes.AppScope

/**
 * Created by ngoctranfire on 8/19/16.
 */
@Module
class AppModule(private val application: Application,
                private val realmConfiguration: RealmConfiguration) {

    @Provides @AppScope
    fun providesAppContext(): Context {
        return application
    }

    @Provides @AppScope
    fun providesSharedPreferences(): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(application)
    }

    @Provides @AppScope
    fun providesRealm(): Realm {
        Realm.deleteRealm(realmConfiguration)
        Realm.setDefaultConfiguration(realmConfiguration)
        return Realm.getDefaultInstance()
    }

}