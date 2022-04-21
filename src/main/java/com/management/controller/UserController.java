package com.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.impl.UserImpl;
import com.management.model.UserDetails;

@RestController
@RequestMapping("/user/book/issue")
public class UserController {
	
	@Autowired
	private UserImpl userImpl;
	
	// Issue the books
	@PostMapping
	public UserDetails issueBooks(@RequestBody UserDetails userDetails, @PathVariable String bookName) {
		return userImpl.issueBooks(userDetails, bookName);
		
	}

}
