package com.te.manytomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyClassForManyToMany {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		Book book = new Book(002, "Dasharatha", null);
		Book book2 = new Book(032, "Ramayana", null);
		
		Reader reader = new Reader(213, "shashi", null);
		Reader reader2 = new Reader(312, "kiran", null);
		
		List<Book> list = Arrays.asList(book,book2);
		List<Reader> list2 = Arrays.asList(reader,reader2);
		
		book.setReaders(list2);
		book2.setReaders(list2);
		reader.setBooks(list);
		reader2.setBooks(list);
		
		transaction.begin();
		em.persist(book);
		em.persist(book2);
		em.persist(reader);
		em.persist(reader2);
		transaction.commit();
	}

}
