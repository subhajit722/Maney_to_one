package dto;

import javax.persistence.*;

@Entity

public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BRANCH_ID")
    private  int id;
    @Column(name = "BRACNG_NAME")
    private String branch_name;
    @Column(name = "BRANCH_ADDERSS")
    private String bracnh_add;
    @Column(name = "BRANCH_CONTECT_NUMBER")
    private long b_ph_;
    @ManyToOne(cascade = CascadeType.ALL)
    private J_Spider j1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getBracnh_add() {
        return bracnh_add;
    }

    public void setBracnh_add(String bracnh_add) {
        this.bracnh_add = bracnh_add;
    }

    public long getB_ph_() {
        return b_ph_;
    }

    public void setB_ph_(long b_ph_) {
        this.b_ph_ = b_ph_;
    }

    public J_Spider getJ1() {
        return j1;
    }

    public void setJ1(J_Spider j1) {
        this.j1 = j1;
    }
}
