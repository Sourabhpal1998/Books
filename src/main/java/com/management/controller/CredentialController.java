package com.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.impl.CredentialImpl;
import com.management.model.Credential;

@RestController
@RequestMapping("/credential")
public class CredentialController {
	
	@Autowired
	private CredentialImpl credentialImpl;
	
	// Create the user id & password
	@PostMapping("/create/admin")
	public Credential createCredentialforAdmin(@RequestBody Credential credential) {
		return credentialImpl.createCredentialforAdmin(credential);
	}
	
	// Get all the list of admin 
	@GetMapping("/list/of/admin")
	public List<Credential> getAllListOfAdmin(){
		return credentialImpl.getAllListOfAdmin();
	}
	
	// Delete Credential
	@DeleteMapping("/delete/admin")
	public String deleteCredential(@PathVariable String username) {
		return credentialImpl.deleteCredential(username);
	}
}
