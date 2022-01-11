package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Team player = new Team();
        player.setId(17);
        player.setName("ABD");
        player.setSalary(1000000);
        player.setDesignation("Finisher");
        
        Team player1 = new Team();
        player1.setId(1);
        player1.setName("shashi");
        player1.setSalary(100000);
        player1.setDesignation("opener");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("students");
        EntityManager em= emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(player);
        em.persist(player1);
        transaction.commit();
        
    }
}
