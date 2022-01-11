package com.te.onetomanymapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Cart {
	@Id
	private int capacity;
	private String shape;
	
	@OneToMany
	private List<Items> list;

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the shape
	 */
	public String getShape() {
		return shape;
	}

	/**
	 * @param shape the shape to set
	 */
	public void setShape(String shape) {
		this.shape = shape;
	}

	/**
	 * @return the list
	 */
	public List<Items> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<Items> list) {
		this.list = list;
	}

	public Cart(int capacity, String shape, List<Items> list) {
		super();
		this.capacity = capacity;
		this.shape = shape;
		this.list = list;
	}

	
	
	

}
