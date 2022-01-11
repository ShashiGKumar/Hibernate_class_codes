package hibernatemappingpractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class L_S_Mapping {
	
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.setLid(1);
		laptop.setName("Dell");
		
		Student student = new Student();
		student.setRollno(101);
		student.setName("shashi");
		student.setMarks(35);
		
		student.setLaptop(laptop);
		laptop.setStudent(student);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(student);
		em.persist(laptop);
		transaction.commit();
	}

}
