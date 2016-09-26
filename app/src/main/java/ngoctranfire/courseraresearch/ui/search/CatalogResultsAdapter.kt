package ngoctranfire.courseraresearch.ui.search

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import ngoctranfire.courseraresearch.R
import ngoctranfire.courseraresearch.model.courses.CourseData


/**
 * Created by ngoctranfire on 9/6/16.
 */

class CatalogResultsAdapter(private var context: Context, private var courseDataList: List<CourseData>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

//    @Retention(AnnotationRetention.SOURCE)
//    @IntDef(HEADER, COURSES)
//    annotation class ViewType

//    companion object {
//        const val HEADER: Long = 0L
//        const val COURSES: Long = 1L
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder? {
        return CourseViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.listing_course, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is CourseViewHolder) {
            holder.bind(getItemAtPosition(position), context)
        }
    }
    override fun getItemCount(): Int {
        return courseDataList.size
    }

    fun updateCourseList(courseData: List<CourseData>) {
        this.courseDataList = courseData
        notifyDataSetChanged()
    }

    private fun getItemAtPosition(position: Int): CourseData {
        return courseDataList[position]
    }

    class CourseViewHolder(itemView: android.view.View): RecyclerView.ViewHolder(itemView) {

        private val image: ImageView
        private val courseCount: TextView
        private val name: TextView
        private val university: TextView

        init {
            image = itemView.findViewById(R.id.course_image_container) as ImageView
            courseCount =  itemView.findViewById(R.id.course_count) as TextView
            name = itemView.findViewById(R.id.course_title) as TextView
            university = itemView.findViewById(R.id.university_name) as TextView
        }

        internal fun bind(courseData: CourseData, context: Context) {
            if (courseData.coursesCount > 0) {
                courseCount.text = Integer.toString(courseData.coursesCount)
                courseCount.visibility = View.VISIBLE
            } else {
                courseCount.visibility = View.INVISIBLE
            }
            name.text = courseData.courseName
            university.text = courseData.universities
            Glide.with(context)
            .load(courseData.imageUrl)
            .diskCacheStrategy(DiskCacheStrategy.SOURCE)
            .into(image)
        }
    }
}
