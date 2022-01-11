package com.te.onetomanymapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.List;

public class MyClass {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		Items items=new Items(4, 235, null);
//		items.setNoOfItems(1);
//		items.setPrice(30);
		
		Items items2 = new Items(21, 1634, null);
//		items2.setNoOfItems(10);
//		items2.setPrice(469);
		
		List<Items> list = Arrays.asList(items,items2);
		
		Cart cart = new Cart(8, "rombus", list);
//		cart.setCapacity(10);
//		cart.setShape("square");
//		cart.setList(list);
		
//		Cart cart2 = new Cart();
//		cart2.setCapacity(20);
//		cart2.setShape("ellipse");
//		cart2.setList(list);
		
		transaction.begin();
//		em.persist(cart);
		em.persist(items);
		em.persist(items2);
		transaction.commit();
	}

}
