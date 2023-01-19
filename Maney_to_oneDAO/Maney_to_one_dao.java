package Maney_to_oneDAO;

import dto.Branch;

import javax.persistence.*;
import java.util.List;

public class Maney_to_one_dao {

    static EntityManagerFactory e1  = Persistence.createEntityManagerFactory("root");
    static EntityManager e2 = e1.createEntityManager();
    static EntityTransaction e3 = e2.getTransaction();
    public void insert(List<Branch> b1){

        for (Branch b2:b1){
        e3.begin();
        e2.persist(b2);

        e3.commit();}
        System.out.println("DATA IS INSERTED");
    }
    public List<Branch> get_all(){
        Query q1 = e2.createQuery("select s from Branch s");
        List <Branch> b1  = q1.getResultList();
        return b1;

    }
    public  Branch get_by_id(int x){
        Branch b1  =e2.find(Branch.class,x);

        return b1;
    }
    public void updated(Branch b1){
        e3.begin();
        e2.merge(b1);
        e3.commit();
        System.out.println("DATA IS UPDATED");
    }
    public void deleted_by_id(int x,int y,int z){
     Branch b1 =    e2.find(Branch.class,x);
        Branch b2 =    e2.find(Branch.class,y);
        Branch b3 =    e2.find(Branch.class,z);
     e3.begin();
     e2.remove(b1);
     e3.commit();
        System.out.println("DATA IS DELETED");
    }
}
