package ngoctranfire.courseraresearch.dagger.modules

import android.content.Context
import com.facebook.stetho.okhttp3.StethoInterceptor
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import ngoctranfire.courseraresearch.dagger.scopes.AppScope
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import rx.schedulers.Schedulers

/**
 * Created by ngoctranfire on 8/20/16.
 */
@Module
class HttpModule() {
    val baseUrl: String = "https://api.coursera.org/api/"
    val cacheSize: Long = 10 * 1024 * 1024 // MiB

    @Provides @AppScope
    fun providesOkHttpCache(context: Context): Cache {
        val cache: Cache = Cache(context.cacheDir, cacheSize)
        return cache
    }

    @Provides @AppScope
    fun provideOkHttpClient(cache: Cache): OkHttpClient {
        return OkHttpClient.Builder()
                .addNetworkInterceptor(StethoInterceptor())
                .cache(cache).build()
    }

    @Provides @AppScope
    fun provideGSON(): Gson {
        return GsonBuilder().create()
    }

    @Provides @AppScope
    fun provideRetrofit(gson: Gson, okHttpClient: OkHttpClient): Retrofit {
        val retrofit: Retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJavaCallAdapterFactory.createWithScheduler(Schedulers.io()))
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .build()
        return retrofit
    }

}