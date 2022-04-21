package com.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.impl.StoresImpl;
import com.management.model.Stores;
import com.management.repository.StoresRepository;

@Service
public class StoresService implements StoresImpl {
	
	
	@Autowired
	private StoresRepository storesRepository;

	@Override
	public Stores createStoresByAdmin(Stores stores) {
		return storesRepository.save(stores);
	}

	@Override
	public List<Stores> getAllListOfStores() {
		return storesRepository.findAll();
	}

	@Override
	public Stores updateStoresDetails(Long storeId, Stores stores) {
		Stores stores2 = storesRepository.findByStoreId(storeId);
		stores2.setStoreId(stores.getStoreId());
		stores2.setStoreName(stores.getStoreName());
		
		Stores updateStore = storesRepository.save(stores2);
		return updateStore;
	}

	@Override
	public String deleteStores(Long storeId) {
		Stores stores = storesRepository.findByStoreId(storeId);
		storesRepository.delete(stores);
		return "Deleted";
	}

}
