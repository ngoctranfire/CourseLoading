package ngoctranfire.courseraresearch.model.courses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ngoctranfire on 9/5/16.
 */

public class Linked {

    @SerializedName("courses.v1")
    @Expose
    private List<CoursesV1> coursesV1 = new ArrayList<CoursesV1>();
    @SerializedName("partners.v1")
    @Expose
    private List<PartnersV1> partnersV1 = new ArrayList<PartnersV1>();
    @SerializedName("onDemandSpecializations.v1")
    @Expose
    private List<OnDemandSpecializationsV1> onDemandSpecializationsV1 = new ArrayList<OnDemandSpecializationsV1>();

    /**
     *
     * @return
     * The coursesV1
     */
    public List<CoursesV1> getCoursesV1() {
        return coursesV1;
    }

    /**
     *
     * @param coursesV1
     * The courses.v1
     */
    public void setCoursesV1(List<CoursesV1> coursesV1) {
        this.coursesV1 = coursesV1;
    }

    public Linked withCoursesV1(List<CoursesV1> coursesV1) {
        this.coursesV1 = coursesV1;
        return this;
    }

    /**
     *
     * @return
     * The partnersV1
     */
    public List<PartnersV1> getPartnersV1() {
        return partnersV1;
    }

    /**
     *
     * @param partnersV1
     * The partners.v1
     */
    public void setPartnersV1(List<PartnersV1> partnersV1) {
        this.partnersV1 = partnersV1;
    }

    public Linked withPartnersV1(List<PartnersV1> partnersV1) {
        this.partnersV1 = partnersV1;
        return this;
    }

    /**
     *
     * @return
     * The onDemandSpecializationsV1
     */
    public List<OnDemandSpecializationsV1> getOnDemandSpecializationsV1() {
        return onDemandSpecializationsV1;
    }

    /**
     *
     * @param onDemandSpecializationsV1
     * The onDemandSpecializations.v1
     */
    public void setOnDemandSpecializationsV1(List<OnDemandSpecializationsV1> onDemandSpecializationsV1) {
        this.onDemandSpecializationsV1 = onDemandSpecializationsV1;
    }

    public Linked withOnDemandSpecializationsV1(List<OnDemandSpecializationsV1> onDemandSpecializationsV1) {
        this.onDemandSpecializationsV1 = onDemandSpecializationsV1;
        return this;
    }

}