package Controler;

import Maney_to_oneDAO.Maney_to_one_dao;
import dto.Branch;
import dto.J_Spider;

import java.util.List;

public class Get_all {
    public static void main(String[] args) {
        Maney_to_one_dao m1  =new Maney_to_one_dao();
        List<Branch> b2  = m1.get_all();
        for(Branch b1:b2){
            System.out.println("____________________BRANCH_________________");
            System.out.println(b1.getId());
            System.out.println(b1.getBranch_name());
            System.out.println(b1.getBracnh_add());
            System.out.println(b1.getB_ph_());
            J_Spider j1 = b1.getJ1();
            System.out.println("_____________________HEADQUTER__________________");
            System.out.println(j1.getId());
            System.out.println(j1.getHeard_QUATER());
            System.out.println(j1.getAdderss());
            System.out.println(j1.getContact_number());
        }
    }
}
