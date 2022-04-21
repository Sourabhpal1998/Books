package com.management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "user_details")
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long userId;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "book_name")
	private String bookName;
	
	public UserDetails() {
		
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public UserDetails(Long userId, String userName, String bookName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.bookName = bookName;
	}
	
	

}
