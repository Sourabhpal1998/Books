package com.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.impl.UserImpl;
import com.management.model.BooksDetails;
import com.management.model.UserDetails;
import com.management.repository.BooksRepoistory;
import com.management.repository.UserRepository;

@Service
public class UserService implements UserImpl {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BooksRepoistory booksRepoistory;

	@Override
	public UserDetails issueBooks(UserDetails userDetails, String bookName) {
		BooksDetails booksDetails = booksRepoistory.findByBookName(bookName);
		if(booksDetails.getNoOfCopies() == 0) {
			System.out.println("Stock is empty");
		}
		else {
			booksDetails.setNoOfCopies(-1);
			userRepository.save(userDetails);
		}
		return userDetails;
	}

}
