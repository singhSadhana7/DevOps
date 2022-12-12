package com.library.librarymanagement.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.library.librarymanagement.model.Book;

@Service
public interface LibraryService {

	List<Book> getBooks();

}
