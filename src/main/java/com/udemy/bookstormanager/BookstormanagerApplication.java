package com.udemy.bookstormanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class BookstormanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstormanagerApplication.class, args);
	}

}
