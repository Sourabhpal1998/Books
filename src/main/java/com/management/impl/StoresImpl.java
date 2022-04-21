package com.management.impl;

import java.util.List;

import com.management.model.Stores;

public interface StoresImpl {
	
	
	public Stores createStoresByAdmin(Stores stores);
	
	public List<Stores> getAllListOfStores();
	
	public Stores updateStoresDetails(Long storeId, Stores stores);
	
	public String deleteStores(Long storeId);

}
