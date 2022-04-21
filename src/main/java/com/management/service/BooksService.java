package com.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.impl.BooksImpl;
import com.management.model.BooksDetails;
import com.management.repository.BooksRepoistory;

@Service
public class BooksService implements BooksImpl {
	
	
	@Autowired
	private BooksRepoistory booksRepoistory;

	@Override
	public BooksDetails saveBooksDetails(BooksDetails booksDetails) {
		return booksRepoistory.save(booksDetails);
	}

	@Override
	public List<BooksDetails> getAllBooksRecords() {
		return booksRepoistory.findAll();
	}

	@Override
	public BooksDetails updateBooksRecords(Long bookId, BooksDetails booksDetails) {
		BooksDetails booksDetails2 = booksRepoistory.findByBookId(bookId);
		booksDetails2.setBookId(booksDetails.getBookId());
		booksDetails2.setBookName(booksDetails.getBookName());
		booksDetails2.setStoreName(booksDetails.getStoreName());
		booksDetails2.setNoOfCopies(booksDetails.getNoOfCopies());
		
		BooksDetails updateBooks = booksRepoistory.save(booksDetails2);
		return updateBooks;
	}

	@Override
	public String deleteBookRecord(Long bookId) {
		BooksDetails booksDetails = booksRepoistory.findByBookId(bookId);
		booksRepoistory.delete(booksDetails);
		return "Deleted";
	}

}
