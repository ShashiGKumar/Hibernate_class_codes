package com.te.onetoonemapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        Laptop laptop1 = new Laptop(7, "hp");
        Laptop laptop2 = new Laptop(8, "lenovo");
        Student student1 = new Student(107, "mahadev", laptop2);
        Student student2 = new Student(108, "mani", laptop1);
        transaction.begin();
        em.persist(laptop1);
        em.persist(laptop2);
        em.persist(student1);
        em.persist(student2);
        transaction.commit();
    }
}
