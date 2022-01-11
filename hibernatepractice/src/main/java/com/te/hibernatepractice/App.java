package com.te.hibernatepractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FirstProgram fp = new FirstProgram();
        fp.setId(3);
        fp.setName("ram");        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
//        em.persist(fp);
        fp=em.get(fp);
        transaction.commit();
        System.out.println(fp);
    }
}
