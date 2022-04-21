package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.model.Credential;

@Repository
public interface CredentialRepository extends JpaRepository<com.management.model.Credential, Long> {

	Credential findByUsername(String username);
	
	
	

}
