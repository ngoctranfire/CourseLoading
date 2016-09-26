package ngoctranfire.courseraresearch.model.courses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ngoctranfire on 9/5/16.
 */

public class Entry {

    @SerializedName("score")
    @Expose
    private Float score;
    @SerializedName("resourceName")
    @Expose
    private String resourceName;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("onDemandSpecializationId")
    @Expose
    private String onDemandSpecializationId;
    @SerializedName("courseId")
    @Expose
    private String courseId;

    /**
     *
     * @return
     * The score
     */
    public Float getScore() {
        return score;
    }

    /**
     *
     * @param score
     * The score
     */
    public void setScore(Float score) {
        this.score = score;
    }

    public Entry withScore(Float score) {
        this.score = score;
        return this;
    }

    /**
     *
     * @return
     * The resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     *
     * @param resourceName
     * The resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Entry withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public Entry withId(String id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @return
     * The onDemandSpecializationId
     */
    public String getOnDemandSpecializationId() {
        return onDemandSpecializationId;
    }

    /**
     *
     * @param onDemandSpecializationId
     * The onDemandSpecializationId
     */
    public void setOnDemandSpecializationId(String onDemandSpecializationId) {
        this.onDemandSpecializationId = onDemandSpecializationId;
    }

    public Entry withOnDemandSpecializationId(String onDemandSpecializationId) {
        this.onDemandSpecializationId = onDemandSpecializationId;
        return this;
    }

    /**
     *
     * @return
     * The courseId
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     *
     * @param courseId
     * The courseId
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public Entry withCourseId(String courseId) {
        this.courseId = courseId;
        return this;
    }

}
