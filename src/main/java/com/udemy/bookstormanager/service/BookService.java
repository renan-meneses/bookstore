package com.udemy.bookstormanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.bookstormanager.dto.MessageResponseDTO;
import com.udemy.bookstormanager.entity.Book;
import com.udemy.bookstormanager.repository.BookRepository;

@Service

public class BookService {
	private BookRepository bookRepository;
	
	@Autowired
	public BookService(BookRepository bookRepository)
	{
		this.bookRepository = bookRepository;
	}
	
	public MessageResponseDTO create ( Book book) 
	{
		Book savedBook = bookRepository.save(book);
		return MessageResponseDTO.builder().message(
				"Book salvo com sucesso" + savedBook.getName() + 
				" o livro tem o numero de paginas de " + savedBook.getPages() + 
				"com id " + savedBook.getId()).build();
	}

}
