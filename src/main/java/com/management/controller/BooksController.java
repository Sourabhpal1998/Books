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

import com.management.impl.BooksImpl;
import com.management.model.BooksDetails;

@RestController
@RequestMapping("/book/api/management")
public class BooksController {
	
	@Autowired
	private BooksImpl booksImpl;
	
	// Save the books
	@PostMapping("/save/new/book")
	public BooksDetails saveBooksDetails(@RequestBody BooksDetails booksDetails) {
		return booksImpl.saveBooksDetails(booksDetails);
	}
	
	// Get all the records of books
	@GetMapping("/get/all/records")
	public List<BooksDetails> getAllBooksRecords(){
		return booksImpl.getAllBooksRecords();
	}
	
	// Update the data of books
	@PutMapping("/update/books")
	public BooksDetails updateBooksRecords(@PathVariable Long bookId, @RequestBody BooksDetails booksDetails) {
		return booksImpl.updateBooksRecords(bookId, booksDetails);
	}
	
	// Delete the records of books
	@DeleteMapping("/delete/record/of/book")
	public String deleteBookRecord(@PathVariable Long bookId) {
		return booksImpl.deleteBookRecord(bookId);
	}

}
