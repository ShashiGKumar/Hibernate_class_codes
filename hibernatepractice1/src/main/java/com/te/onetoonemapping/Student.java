package com.te.onetoonemapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	
	@OneToOne
	private Laptop laptop;

	public Student(int sid, String sname, Laptop laptop) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.laptop = laptop;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	
	

}
