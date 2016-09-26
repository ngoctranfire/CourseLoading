package ngoctranfire.courseraresearch.util

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction

/**
 * Created by ngoctranfire on 9/12/16.
 */

object ActivityUtils {

    fun addFragmentToActivity(fragmentManager: FragmentManager, fragment:Fragment, frameId: Int) {
        val transaction: FragmentTransaction = fragmentManager.beginTransaction()
        transaction.add(frameId, fragment)
        transaction.commit()
    }
}