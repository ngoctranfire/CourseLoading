package ngoctranfire.courseraresearch.model.courses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ngoctranfire on 9/5/16.
 */

public class Facets {

    @SerializedName("display_prop_bool")
    @Expose
    private DisplayPropBool displayPropBool;
    @SerializedName("subdomains")
    @Expose
    private Subdomains subdomains;
    @SerializedName("productType_prop_str")
    @Expose
    private ProductTypePropStr productTypePropStr;
    @SerializedName("courseType")
    @Expose
    private CourseType courseType;
    @SerializedName("languages")
    @Expose
    private Languages languages;
    @SerializedName("subtitleLanguages")
    @Expose
    private SubtitleLanguages subtitleLanguages;
    @SerializedName("domains")
    @Expose
    private Domains domains;
    @SerializedName("availability")
    @Expose
    private Availability availability;
    @SerializedName("primaryLanguages")
    @Expose
    private PrimaryLanguages primaryLanguages;

    /**
     *
     * @return
     * The displayPropBool
     */
    public DisplayPropBool getDisplayPropBool() {
        return displayPropBool;
    }

    /**
     *
     * @param displayPropBool
     * The display_prop_bool
     */
    public void setDisplayPropBool(DisplayPropBool displayPropBool) {
        this.displayPropBool = displayPropBool;
    }

    public Facets withDisplayPropBool(DisplayPropBool displayPropBool) {
        this.displayPropBool = displayPropBool;
        return this;
    }

    /**
     *
     * @return
     * The subdomains
     */
    public Subdomains getSubdomains() {
        return subdomains;
    }

    /**
     *
     * @param subdomains
     * The subdomains
     */
    public void setSubdomains(Subdomains subdomains) {
        this.subdomains = subdomains;
    }

    public Facets withSubdomains(Subdomains subdomains) {
        this.subdomains = subdomains;
        return this;
    }

    /**
     *
     * @return
     * The productTypePropStr
     */
    public ProductTypePropStr getProductTypePropStr() {
        return productTypePropStr;
    }

    /**
     *
     * @param productTypePropStr
     * The productType_prop_str
     */
    public void setProductTypePropStr(ProductTypePropStr productTypePropStr) {
        this.productTypePropStr = productTypePropStr;
    }

    public Facets withProductTypePropStr(ProductTypePropStr productTypePropStr) {
        this.productTypePropStr = productTypePropStr;
        return this;
    }

    /**
     *
     * @return
     * The courseType
     */
    public CourseType getCourseType() {
        return courseType;
    }

    /**
     *
     * @param courseType
     * The courseType
     */
    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public Facets withCourseType(CourseType courseType) {
        this.courseType = courseType;
        return this;
    }

    /**
     *
     * @return
     * The languages
     */
    public Languages getLanguages() {
        return languages;
    }

    /**
     *
     * @param languages
     * The languages
     */
    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    public Facets withLanguages(Languages languages) {
        this.languages = languages;
        return this;
    }

    /**
     *
     * @return
     * The subtitleLanguages
     */
    public SubtitleLanguages getSubtitleLanguages() {
        return subtitleLanguages;
    }

    /**
     *
     * @param subtitleLanguages
     * The subtitleLanguages
     */
    public void setSubtitleLanguages(SubtitleLanguages subtitleLanguages) {
        this.subtitleLanguages = subtitleLanguages;
    }

    public Facets withSubtitleLanguages(SubtitleLanguages subtitleLanguages) {
        this.subtitleLanguages = subtitleLanguages;
        return this;
    }

    /**
     *
     * @return
     * The domains
     */
    public Domains getDomains() {
        return domains;
    }

    /**
     *
     * @param domains
     * The domains
     */
    public void setDomains(Domains domains) {
        this.domains = domains;
    }

    public Facets withDomains(Domains domains) {
        this.domains = domains;
        return this;
    }

    /**
     *
     * @return
     * The availability
     */
    public Availability getAvailability() {
        return availability;
    }

    /**
     *
     * @param availability
     * The availability
     */
    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public Facets withAvailability(Availability availability) {
        this.availability = availability;
        return this;
    }

    /**
     *
     * @return
     * The primaryLanguages
     */
    public PrimaryLanguages getPrimaryLanguages() {
        return primaryLanguages;
    }

    /**
     *
     * @param primaryLanguages
     * The primaryLanguages
     */
    public void setPrimaryLanguages(PrimaryLanguages primaryLanguages) {
        this.primaryLanguages = primaryLanguages;
    }

    public Facets withPrimaryLanguages(PrimaryLanguages primaryLanguages) {
        this.primaryLanguages = primaryLanguages;
        return this;
    }

}