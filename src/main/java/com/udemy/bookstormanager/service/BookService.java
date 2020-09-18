package com.udemy.bookstormanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.udemy.bookstormanager.dto.BookDTO;
import com.udemy.bookstormanager.dto.MessageResponseDTO;
import com.udemy.bookstormanager.entity.Book;
import com.udemy.bookstormanager.mapper.BookMapper;
import com.udemy.bookstormanager.repository.BookRepository;

@Service

public class BookService {
	private BookRepository bookRepository;
	private final BookMapper bookMapper =  BookMapper.INSTANCE;
	
	@Autowired
	public BookService(BookRepository bookRepository)
	{
		this.bookRepository = bookRepository;
	}

	public MessageResponseDTO create ( @Validated BookDTO bookDTO) 
	{
		Book salveBook = bookMapper.toModel(bookDTO);
		Book savedBook = bookRepository.save(salveBook);
		return MessageResponseDTO.builder().message(
				"Book salvo com sucesso" + savedBook.getName() + 
				" o livro tem o numero de paginas de " + savedBook.getPages() + 
				"com id " + savedBook.getId()).build();
	}

}
