package dto;

import javax.persistence.*;

@Entity

public class J_Spider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Heard_quter_id")
    private int id;
    @Column(name = "Heard_quter_name")
    private String Heard_QUATER;
    @Column(name = "Heard_quter_Adderss")
    private String adderss;
    @Column(name = "Heard_quter_NUmber")
    private long contact_number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeard_QUATER() {
        return Heard_QUATER;
    }

    public void setHeard_QUATER(String heard_QUATER) {
        Heard_QUATER = heard_QUATER;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    public long getContact_number() {
        return contact_number;
    }

    public void setContact_number(long contact_number) {
        this.contact_number = contact_number;
    }
}
