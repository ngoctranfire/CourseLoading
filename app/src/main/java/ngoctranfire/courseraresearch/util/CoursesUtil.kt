package ngoctranfire.courseraresearch.util


import android.support.annotation.NonNull
import android.support.v4.util.ArrayMap

import ngoctranfire.courseraresearch.model.courses.PartnersV1

/**
 * Created by ngoctranfire on 9/12/16.
 */

object CoursesUtil {

    @NonNull
    fun getPartnerUniversityHashMap(partners: List<PartnersV1>): ArrayMap<String, String> {
        val partnerMap = ArrayMap<String, String>()
        for (i in partners.indices) {
            partnerMap.put(partners[i].id, partners[i].name)
        }
        return partnerMap
    }

    @NonNull
    fun partnersToString(partners: List<String>, partnersMap: ArrayMap<String, String>): String {
        val builder: StringBuilder = StringBuilder("")
        for(i in partners.indices) {
            builder.append(partnersMap[partners[i]])
            if (i != partners.size - 1) {
                builder.append(", ")
            }
        }
        return builder.toString()
    }
}

