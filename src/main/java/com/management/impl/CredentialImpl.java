package com.management.impl;

import java.util.List;

import com.management.model.Credential;

public interface CredentialImpl {
	
	
	public Credential createCredentialforAdmin(Credential credential);
	
	public List<Credential> getAllListOfAdmin();
	
	public String deleteCredential(String username);

}
