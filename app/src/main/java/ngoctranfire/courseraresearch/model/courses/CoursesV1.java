package ngoctranfire.courseraresearch.model.courses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ngoctranfire on 9/5/16.
 */
public class CoursesV1 {

    @SerializedName("courseType")
    @Expose
    private String courseType;
    @SerializedName("photoUrl")
    @Expose
    private String photoUrl;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("partnerIds")
    @Expose
    private List<String> partnerIds = new ArrayList<String>();
    @SerializedName("name")
    @Expose
    private String name;

    /**
     *
     * @return
     * The courseType
     */
    public String getCourseType() {
        return courseType;
    }

    /**
     *
     * @param courseType
     * The courseType
     */
    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public CoursesV1 withCourseType(String courseType) {
        this.courseType = courseType;
        return this;
    }

    /**
     *
     * @return
     * The photoUrl
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     *
     * @param photoUrl
     * The photoUrl
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public CoursesV1 withPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
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

    public CoursesV1 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @return
     * The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     *
     * @param slug
     * The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public CoursesV1 withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     *
     * @return
     * The partnerIds
     */
    public List<String> getPartnerIds() {
        return partnerIds;
    }

    /**
     *
     * @param partnerIds
     * The partnerIds
     */
    public void setPartnerIds(List<String> partnerIds) {
        this.partnerIds = partnerIds;
    }

    public CoursesV1 withPartnerIds(List<String> partnerIds) {
        this.partnerIds = partnerIds;
        return this;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public CoursesV1 withName(String name) {
        this.name = name;
        return this;
    }

}