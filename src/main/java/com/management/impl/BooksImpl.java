package com.management.impl;

import java.util.List;

import com.management.model.BooksDetails;

public interface BooksImpl {
	
	public BooksDetails saveBooksDetails(BooksDetails booksDetails);
	
	public List<BooksDetails> getAllBooksRecords();
	
	public BooksDetails updateBooksRecords(Long bookId, BooksDetails booksDetails);
	
	public String deleteBookRecord(Long bookId);

}
