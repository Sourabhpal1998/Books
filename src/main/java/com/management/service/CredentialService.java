package com.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.impl.CredentialImpl;
import com.management.model.Credential;
import com.management.repository.CredentialRepository;

@Service
public class CredentialService implements CredentialImpl {
	
	
	@Autowired
	private CredentialRepository credentialRepository;

	@Override
	public Credential createCredentialforAdmin(Credential credential) {
		return credentialRepository.save(credential); 
	}

	@Override
	public List<Credential> getAllListOfAdmin() {
		return credentialRepository.findAll();
	}

	@Override
	public String deleteCredential(String username) {
		Credential credential = credentialRepository.findByUsername(username);
		credentialRepository.delete(credential);
		return "Deleted";
		
	}

}
