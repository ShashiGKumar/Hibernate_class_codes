package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("students");
		EntityManager em = emf.createEntityManager();
		Team player = em.find(Team.class, 1);
		System.out.println(player);
		
		EntityTransaction transaction = em.getTransaction();
//		   delete the record
	        Team kl=em.find(Team.class, 1);
	        transaction.begin();
	        em.remove(kl);
	        transaction.commit();
	        
//	        update the data                            
	        Team abd=em.find(Team.class, 12);
	        transaction.begin();
	        transaction.commit();
	        System.out.println("update");
		
	}

}
