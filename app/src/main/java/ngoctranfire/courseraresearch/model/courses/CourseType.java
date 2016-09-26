package ngoctranfire.courseraresearch.model.courses;

/**
 * Created by ngoctranfire on 9/5/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CourseType {

    @SerializedName("facetEntries")
    @Expose
    private List<FacetEntry> facetEntries = new ArrayList<FacetEntry>();

    /**
     *
     * @return
     * The facetEntries
     */
    public List<FacetEntry> getFacetEntries() {
        return facetEntries;
    }

    /**
     *
     * @param facetEntries
     * The facetEntries
     */
    public void setFacetEntries(List<FacetEntry> facetEntries) {
        this.facetEntries = facetEntries;
    }

    public CourseType withFacetEntries(List<FacetEntry> facetEntries) {
        this.facetEntries = facetEntries;
        return this;
    }

}
