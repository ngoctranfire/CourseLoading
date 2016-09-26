package ngoctranfire.courseraresearch.model.courses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ngoctranfire on 9/5/16.
 */
public class Element {

    @SerializedName("entries")
    @Expose
    private List<Entry> entries = new ArrayList<Entry>();
    @SerializedName("id")
    @Expose
    private String id;

    /**
     *
     * @return
     * The entries
     */
    public List<Entry> getEntries() {
        return entries;
    }

    /**
     *
     * @param entries
     * The entries
     */
    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public Element withEntries(List<Entry> entries) {
        this.entries = entries;
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

    public Element withId(String id) {
        this.id = id;
        return this;
    }

}