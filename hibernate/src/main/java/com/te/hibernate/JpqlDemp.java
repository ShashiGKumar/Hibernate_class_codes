package com.te.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlDemp {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("students");
		EntityManager createEntityManager = emf.createEntityManager();
//		String query="from Team";
//		Query createQuery = createEntityManager.createQuery(query);
//		List<Team> resultList = createQuery.getResultList();
//		for(Team team:resultList) {
//			System.out.println(team);
//		}
		
		String query1="select min(salary) from Team";
		Query createQuery2 = createEntityManager.createQuery(query1);
		Double singleResult = (Double)createQuery2.getSingleResult();
		System.out.println(singleResult);
//		Object singleResult = createQuery.getSingleResult();
//		System.out.println(singleResult);
		
		EntityTransaction transaction = createEntityManager.getTransaction();
		String query2="update Team set salary=:sal where id=:od";
		transaction.begin();
		Query createQuery = createEntityManager.createQuery(query2);
		createQuery.setParameter("sal", 320.0);
		createQuery.setParameter("od", 2);
		int executeUpdate = createQuery.executeUpdate();
		transaction.commit();
//		Query createQuery = createEntityManager.createQuery(query2);
//		int executeUpdate = createQuery.executeUpdate();
//		transaction.commit();
		
		EntityTransaction transaction2 = createEntityManager.getTransaction();
		String query3 = "delete from Team where id=12";
		transaction.begin();
		Query createQuery3 = createEntityManager.createQuery(query3);
		int executeUpdate2 = createQuery3.executeUpdate();
		transaction.commit();
		
	}

}
