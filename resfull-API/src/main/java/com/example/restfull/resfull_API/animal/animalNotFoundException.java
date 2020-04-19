package com.example.restfull.resfull_API.animal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(HttpStatus.NOT_FOUND)
public class animalNotFoundException extends RuntimeException {

	public animalNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
