package com.pranav.tech.dbconfigurator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//enum Type {
//	TEXT,
//	IMAGE,
//	BOTH;
//}

@Entity
//@Component("cat")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false, unique = true)
	private int cId;
	
	private String name;
	private String type;
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Category [cId=" + cId + ", name=" + name + ", Type=" + type + "]";
	}
	
	
	
}
