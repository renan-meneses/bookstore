package com.udemy.bookstormanager.dto;

import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotBlank;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AutorDTO {
		
	private Long id;
	@NotBlank
	@Size(max = 200)
	private String name;
	@NotNull
	@Size(max=100)
	private Integer age;

}
