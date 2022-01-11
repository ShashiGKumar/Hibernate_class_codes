package com.te.crudoperations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
//		Student1 student1 = new Student1();
//		student1.setId(101);
//		student1.setName("shashi");
//		em.persist(student1);
		
//		Student1 find = em.find(Student1.class, 101);
//		System.out.println(find.getName());
		
//		Student1 find1 = em.find(Student1.class, 101);
//		find1.setName("guru");
//		em.persist(find1);
		
		Student1 find2 = em.find(Student1.class, 104);
		
		
		transaction.commit();
	}

}
