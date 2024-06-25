package jpashop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.Date;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        tx.begin();

        try{

            /*
            item이랑 book,album,movie 상속 어캐 되어있는지만 보면 될듯
            */



            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }














        emf.close();
    }
}
