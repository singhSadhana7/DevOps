package com.library.librarymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.librarymanagement.model.Book;
import com.library.librarymanagement.service.LibraryService;

@RestController
@RequestMapping("api/v1")
public class LibraryController {
	
	@Autowired
	private LibraryService libraryService;

	@GetMapping
	public String getBooks(){
		return "welcome in Capgemni";
		
	}

}
