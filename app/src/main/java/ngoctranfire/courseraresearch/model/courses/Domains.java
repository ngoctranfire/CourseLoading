package ngoctranfire.courseraresearch.model.courses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ngoctranfire on 9/5/16.
 */

public class Domains {

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

    public Domains withFacetEntries(List<FacetEntry> facetEntries) {
        this.facetEntries = facetEntries;
        return this;
    }

}