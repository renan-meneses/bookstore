package com.udemy.bookstormanager.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.bookstormanager.dto.MessageResponseDTO;
import com.udemy.bookstormanager.entity.Book;
import com.udemy.bookstormanager.service.BookService;

@RequestMapping("/api/v1/books")
@RestController
public class BookController {

	private BookService bookService;
	
	@Autowired
	public BookController(BookService bookService)
	{
		this.bookService = bookService;
	}
	@PostMapping
	public MessageResponseDTO create (@RequestBody Book book) 
	{
		return bookService.create(book);
	}
}
