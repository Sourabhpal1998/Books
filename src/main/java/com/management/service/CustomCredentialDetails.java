package com.management.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.management.model.Credential;

public class CustomCredentialDetails implements UserDetails {
	
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Credential credential;
	
	

	public CustomCredentialDetails(Credential credential) {
		super();
		this.credential = credential;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Collections.singleton(new SimpleGrantedAuthority(credential.getRole()));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return credential.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return credential.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
