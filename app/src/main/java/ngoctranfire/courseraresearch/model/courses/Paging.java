package ngoctranfire.courseraresearch.model.courses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ngoctranfire on 9/5/16.
 */

public class Paging {

    @SerializedName("next")
    @Expose
    private String next;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("facets")
    @Expose
    private Facets facets;

    /**
     *
     * @return
     * The next
     */
    public String getNext() {
        return next;
    }

    /**
     *
     * @param next
     * The next
     */
    public void setNext(String next) {
        this.next = next;
    }

    public Paging withNext(String next) {
        this.next = next;
        return this;
    }

    /**
     *
     * @return
     * The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     *
     * @param total
     * The total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    public Paging withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     *
     * @return
     * The facets
     */
    public Facets getFacets() {
        return facets;
    }

    /**
     *
     * @param facets
     * The facets
     */
    public void setFacets(Facets facets) {
        this.facets = facets;
    }

    public Paging withFacets(Facets facets) {
        this.facets = facets;
        return this;
    }

}