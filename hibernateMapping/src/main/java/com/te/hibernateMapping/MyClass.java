package com.te.hibernateMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyClass {
	
	public static void main(String[] args) {
		Girl girl = new Girl();
		girl.setGid(1);
		girl.setName("ash");
		
		Boy boy = new Boy();
		boy.setBid(101);
		boy.setName("abhi-shek");
		boy.setBalance(102000);
		
		girl.setB(boy);
		
		boy.setGirl(girl);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(boy);
		em.persist(girl);
		transaction.commit();
	}

}
