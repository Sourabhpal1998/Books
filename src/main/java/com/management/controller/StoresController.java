package com.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.impl.StoresImpl;
import com.management.model.Stores;

@RestController
@RequestMapping("/store")
public class StoresController {
	
	@Autowired
	private StoresImpl storesImpl;
	
	// Create the store 
	@PostMapping("/create/store")
	public Stores createStoresByAdmin(@RequestBody Stores stores) {
		return storesImpl.createStoresByAdmin(stores);
	}
	
	// Get all list of stores
	@GetMapping("/list/of/all/stores")
	public List<Stores> getAllListOfStores(){
		return storesImpl.getAllListOfStores();
	}
	
	// Update Store details
	@PutMapping("/update/store/details")
	public Stores updateStoresDetails(@PathVariable Long storeId, @RequestBody Stores stores) {
		return storesImpl.updateStoresDetails(storeId, stores);
	}
	
	// Delete Store
	@DeleteMapping("/delete/store")
	public String deleteStores(@PathVariable Long storeId) {
		return storesImpl.deleteStores(storeId);
	}
	
}
