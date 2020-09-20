package com.udemy.bookstormanager.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.javafaker.Faker;
import com.udemy.bookstormanager.dto.BookDTO;
import com.udemy.bookstormanager.entity.Book;
import com.udemy.bookstormanager.entity.Autor;


import static com.udemy.bookstormanager.utils.AutorUtils.createFakeAutor;
import static com.udemy.bookstormanager.utils.AutorUtils.createFakeAutorDTO;
import static com.udemy.bookstormanager.utils.AutorUtils.createFakeAutorFrom;


public class BookUtils {

    private static final Faker faker = Faker.instance();

    public static BookDTO createFakeBookDTO() 
    {
        return BookDTO.builder()
                .id(faker.number().randomNumber())
                .name(faker.book().title())
                .pages(faker.number().numberBetween(0, 200))
                .chapters(faker.number().numberBetween(1, 20))
                .isbn("0-596-52068-9")
                .publisherName(faker.book().publisher())
                .autor(createFakeAutorDTO())
                .build();
    }

    public static Book createFakeBook() 
    {
        return Book.builder()
                .id(faker.number().randomNumber())
                .name(faker.book().title())
                .pages(faker.number().numberBetween(0, 200))
                .chapters(faker.number().numberBetween(1, 20))
                .isbn("0-596-52068-9")
                .publisherName(faker.book().publisher())
                .autor(createFakeBook())
                .build();
    }

    public static Book createFakeBookFrom(BookDTO bookDTO) 
    {
        return Book.builder()
                .id(bookDTO.getId())
                .name(bookDTO.getName())
                .pages(bookDTO.getPages())
                .chapters(bookDTO.getChapters())
                .isbn(bookDTO.getIsbn())
                .publisherName(bookDTO.getPublisherName())
                .autor(createFakeAutorFrom(bookDTO.getAutor()))
                .build();
    }

    public static String asJsonString(BookDTO bookDTO) 
    {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
            objectMapper.registerModules(new JavaTimeModule());

            return objectMapper.writeValueAsString(bookDTO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}