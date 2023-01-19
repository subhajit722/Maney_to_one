package Controler;

import Maney_to_oneDAO.Maney_to_one_dao;
import dto.Branch;
import dto.J_Spider;

import java.util.ArrayList;
import java.util.List;

public class Insert {
    public static void main(String[] args) {
        Branch b1  =new Branch();
        b1.setBranch_name("QSPIDER_KOLKATA");
        b1.setBracnh_add("KOLKATA");
        b1.setB_ph_(456726467890l);
        Branch b2  =new Branch();
        b2.setBranch_name("JSPIDER_DHILE");
        b2.setBracnh_add("DHILE");
        b2.setB_ph_(45672646767780l);
        Branch b3  =new Branch();
        b3.setBranch_name("QSPIDER_MUMBAI");
        b3.setBracnh_add("MUMBAI");
        b3.setB_ph_(4567264677657l);
        J_Spider j1 = new J_Spider();
        j1.setHeard_QUATER("BANGALURU");
        j1.setAdderss("BANGALURU");
        j1.setContact_number(465672635466l);

        b1.setJ1(j1);
        b2.setJ1(j1);
        b3.setJ1(j1);
        List<Branch> l1  =new ArrayList<>();
        l1.add(b1);
        l1.add(b2);
        l1.add(b3);

        Maney_to_one_dao m1 =new Maney_to_one_dao();
        m1.insert(l1);
    }
}
