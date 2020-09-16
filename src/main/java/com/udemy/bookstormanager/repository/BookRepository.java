package com.udemy.bookstormanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.bookstormanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	

}
