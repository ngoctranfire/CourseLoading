package ngoctranfire.courseraresearch.model.courses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ngoctranfire on 9/5/16.
 */

public class SearchResults {

    @SerializedName("elements")
    @Expose
    private List<Element> elements = new ArrayList<Element>();
    @SerializedName("paging")
    @Expose
    private Paging paging;
    @SerializedName("linked")
    @Expose
    private Linked linked;

    /**
     *
     * @return
     * The elements
     */
    public List<Element> getElements() {
        return elements;
    }

    /**
     *
     * @param elements
     * The elements
     */
    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public SearchResults withElements(List<Element> elements) {
        this.elements = elements;
        return this;
    }

    /**
     *
     * @return
     * The paging
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     *
     * @param paging
     * The paging
     */
    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public SearchResults withPaging(Paging paging) {
        this.paging = paging;
        return this;
    }

    /**
     *
     * @return
     * The linked
     */
    public Linked getLinked() {
        return linked;
    }

    /**
     *
     * @param linked
     * The linked
     */
    public void setLinked(Linked linked) {
        this.linked = linked;
    }

    public SearchResults withLinked(Linked linked) {
        this.linked = linked;
        return this;
    }

}
