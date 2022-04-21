package com.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "stores")
public class Stores {
	
	@Id
	@Column(name = "store_id")
	private Long storeId;
	
	@Column(name = "store_name")
	private String storeName;
	
	
	public Stores() {
		
	}


	public Long getStoreId() {
		return storeId;
	}


	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}


	public String getStoreName() {
		return storeName;
	}


	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}


	public Stores(Long storeId, String storeName) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
	}
	
	

}
