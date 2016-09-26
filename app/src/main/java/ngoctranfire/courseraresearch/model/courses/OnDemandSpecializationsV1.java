package ngoctranfire.courseraresearch.model.courses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ngoctranfire on 9/5/16.
 */

public class OnDemandSpecializationsV1 {

    @SerializedName("courseIds")
    @Expose
    private List<String> courseIds = new ArrayList<String>();
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("partnerIds")
    @Expose
    private List<String> partnerIds = new ArrayList<String>();
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("tagline")
    @Expose
    private String tagline;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("slug")
    @Expose
    private String slug;

    /**
     *
     * @return
     * The courseIds
     */
    public List<String> getCourseIds() {
        return courseIds;
    }

    /**
     *
     * @param courseIds
     * The courseIds
     */
    public void setCourseIds(List<String> courseIds) {
        this.courseIds = courseIds;
    }

    public OnDemandSpecializationsV1 withCourseIds(List<String> courseIds) {
        this.courseIds = courseIds;
        return this;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public OnDemandSpecializationsV1 withDescription(String description) {
        this.description = description;
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

    public OnDemandSpecializationsV1 withPartnerIds(List<String> partnerIds) {
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

    public OnDemandSpecializationsV1 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     * The tagline
     */
    public String getTagline() {
        return tagline;
    }

    /**
     *
     * @param tagline
     * The tagline
     */
    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public OnDemandSpecializationsV1 withTagline(String tagline) {
        this.tagline = tagline;
        return this;
    }

    /**
     *
     * @return
     * The logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     *
     * @param logo
     * The logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public OnDemandSpecializationsV1 withLogo(String logo) {
        this.logo = logo;
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

    public OnDemandSpecializationsV1 withId(String id) {
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

    public OnDemandSpecializationsV1 withSlug(String slug) {
        this.slug = slug;
        return this;
    }

}