package ngoctranfire.courseraresearch.api

import ngoctranfire.courseraresearch.model.courses.SearchResults
import retrofit2.http.GET
import retrofit2.http.QueryMap
import rx.Observable

/**
 * Created by ngoctranfire on 9/5/16.
 */

interface CatalogResultsApi {

    @GET("catalogResults.v2")
    fun searchCourses( @QueryMap queryParams: Map<String, String>): Observable<SearchResults>
}