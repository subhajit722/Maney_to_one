package Controler;

import Maney_to_oneDAO.Maney_to_one_dao;
import dto.Branch;
import dto.J_Spider;

public class Updated {
    public static void main(String[] args) {
        Branch b1  =new Branch();
        b1.setId(1);
        b1.setBranch_name("QSPIDER_AND_JSPIDER_KOLKATA");
        b1.setBracnh_add("KOLKATA");
        b1.setB_ph_(456726467890l);

        J_Spider j1 = new J_Spider();
        j1.setId(1);
        j1.setHeard_QUATER("BANGALURU");
        j1.setAdderss("BANGALURU");
        j1.setContact_number(465672635466l);

        b1.setJ1(j1);


        Maney_to_one_dao m1 =new Maney_to_one_dao();
       m1.updated(b1);
    }
}
