package com.pranav.tech.dbconfigurator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Scope(value="singleton")
public class Content {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false, unique = true)
	private int id;
	
//	@Size(min=6, message = "Enter atleast 6 characters")
	private String data;
	private int shares;
	
//	@Autowired
//	@Qualifier("cat")
	private int category;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public int getShares() {
		return shares;
	}
	public void setShares(int shares) {
		this.shares = shares;
	}
	
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "Data [id=" + id + ", data=" + data + ", shares=" + shares + ", category=" + category + "]";
	}

	
}
