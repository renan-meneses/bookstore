package com.udemy.bookstormanager.mapper;

import org.mapstruct.Mapper;

import com.udemy.bookstormanager.dto.BookDTO;
import com.udemy.bookstormanager.entity.Book;

@Mapper
public interface BookMapper {
	
	Book toModel(BookDTO bookDTO);
	
	BookDTO toDTO(Book book);
}
