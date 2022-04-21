package com.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.management.model.Credential;
import com.management.repository.CredentialRepository;

@Service
public class CustomCredentialDetailsService implements UserDetailsService {
	
	
	@Autowired
	private CredentialRepository credentialRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Credential credential = credentialRepository.findByUsername(username);
		if(credential == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return new CustomCredentialDetails(credential);
	}
	
	
	

}
