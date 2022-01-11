package com.te.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Reader {
	@Id
	private int rid;
	private String rname;
	@ManyToMany
	private List<Book> books;

	public Reader(int rid, String rname, List<Book> books) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.books = books;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	

}
