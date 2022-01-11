package com.te.hibernateMapping;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyClassMyClass {
	
	public static void main(String[] args) {
		GirlGirl girl = new GirlGirl();
		girl.setGid(420);
		girl.setName("sayali the lord");
		
		BoyBoy boy = new BoyBoy();
		boy.setBid(1);
		boy.setName("sharukh");
		boy.setBalance(100000);
		
		BoyBoy boy2 = new BoyBoy();
		boy2.setBid(2);
		boy2.setName("mahadev");
		boy2.setBalance(2000000);
		
		BoyBoy boy3 = new BoyBoy();
		boy3.setBid(3);
		boy3.setName("hemu");
		boy3.setBalance(23048);
		
		List<BoyBoy> listOfBoys = Arrays.asList(boy,boy2,boy3);
		boy.setGirl(girl);
		boy2.setGirl(girl);
		boy3.setGirl(girl);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(boy);
		em.persist(boy2);
		em.persist(boy3);
		em.persist(girl);
		transaction.commit();
	}

}
