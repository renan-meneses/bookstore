package com.udemy.bookstormanager.utils;

import com.github.javafaker.Faker;
import com.udemy.bookstormanager.dto.AutorDTO;
import com.udemy.bookstormanager.entity.Autor;


public class AutorUtils {

    private static final Faker faker = Faker.instance();

    public static AutorDTO createFakeAutorDTO() 
    {
        return AutorDTO.builder()
                .id(faker.number().randomNumber())
                .name(faker.book().Autor())
                .age(faker.number().numberBetween(0, 100))
                .build();
    }

    public static Autor createFakeAutor() 
    {
        return Autor.builder()
                .id(faker.number().randomNumber())
                .name(faker.book().Autor())
                .age(faker.number().numberBetween(0, 100))
                .build();
    }

    public static Autor createFakeAutorFrom(AutorDTO autorDTO) 
    {
        return Autor.builder()
                .id(AutorDTO.getId())
                .name(AutorDTO.getName())
                .age(AutorDTO.getAge())
                .build();
    }
}