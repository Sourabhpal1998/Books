package com.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "books_details")
public class BooksDetails {
	
	@Id
	@Column(name = "book_id")
	private Long BookId;
	
	@Column(name = "book_name")
	private String bookName;
	
	@Column(name = "store_name")
	private String storeName;
	
	@Column(name = "copies")
	private int noOfCopies;
	
	public BooksDetails() {
		
	}

	public Long getBookId() {
		return BookId;
	}

	public void setBookId(Long bookId) {
		BookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public BooksDetails(Long bookId, String bookName, String storeName, int noOfCopies) {
		super();
		BookId = bookId;
		this.bookName = bookName;
		this.storeName = storeName;
		this.noOfCopies = noOfCopies;
	}
	
	

}
