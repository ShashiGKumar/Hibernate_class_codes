package com.te.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Book {
	@Id
	private int bid;
	private String title;
	@ManyToMany
	private List<Reader> readers;

	public Book(int bid, String title, List<Reader> readers) {
		super();
		this.bid = bid;
		this.title = title;
		this.readers = readers;
	}

	/**
	 * @return the bid
	 */
	public int getBid() {
		return bid;
	}

	/**
	 * @param bid the bid to set
	 */
	public void setBid(int bid) {
		this.bid = bid;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the readers
	 */
	public List<Reader> getReaders() {
		return readers;
	}

	/**
	 * @param readers the readers to set
	 */
	public void setReaders(List<Reader> readers) {
		this.readers = readers;
	}
	
	

}
