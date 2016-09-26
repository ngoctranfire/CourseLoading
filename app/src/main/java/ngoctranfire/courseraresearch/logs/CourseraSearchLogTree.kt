package ngoctranfire.courseraresearch.logs;

import timber.log.Timber

/**
 * Created by ngoctranfire on 8/20/16.
 */

class CourseraSearchLogTree : Timber.DebugTree() {
    override fun createStackElementTag(element: StackTraceElement) : String {
        return "*CourseraLogs* (${super.createStackElementTag(element)}.kt: ${element.getLineNumber()})";
    }
}
