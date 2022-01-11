package com.te.hibernateMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class BoyBoy {
	@Id
	private int bid;
	private String name;
	private double balance;
	@ManyToOne
	private GirlGirl girl;
	
	
	public GirlGirl getGirl() {
		return girl;
	}

	public void setGirl(GirlGirl girl) {
		this.girl = girl;
	}

	public int getBid() {
		return bid;
	}
	
	public void setBid(int bid) {
		this.bid = bid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BoyBoy [bid=" + bid + ", name=" + name + ", balance=" + balance + "]";
	}
	
	

}
