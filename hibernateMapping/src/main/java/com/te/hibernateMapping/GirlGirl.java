package com.te.hibernateMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class GirlGirl {
	@Id
	private int gid;
	private String name;
	
	@OneToMany(mappedBy = "girl")
	private List<BoyBoy> boys;
	
    
	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public List<BoyBoy> getBoys() {
		return boys;
	}

	public void setBoys(List<BoyBoy> boys) {
		this.boys = boys;
	}



	@Override
	public String toString() {
		return "GirlGirl [gid=" + gid + ", name=" + name + ", boys=" + boys + "]";
	}
	
	
	

}
