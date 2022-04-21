package com.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.model.BooksDetails;

@Repository
public interface BooksRepoistory extends JpaRepository<BooksDetails, Long> {

	BooksDetails findByBookId(Long bookId);

	BooksDetails findByBookName(String bookName);

}
