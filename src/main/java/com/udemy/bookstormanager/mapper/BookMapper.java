package com.udemy.bookstormanager.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.udemy.bookstormanager.dto.BookDTO;
import com.udemy.bookstormanager.entity.Book;

@Mapper
public interface BookMapper 
{
	
	BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
	
	Book toModel(BookDTO bookDTO);
	
	BookDTO toDTO(Book book);
}
