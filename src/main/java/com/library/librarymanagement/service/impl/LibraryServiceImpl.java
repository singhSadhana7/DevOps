package com.library.librarymanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.library.librarymanagement.model.Book;
import com.library.librarymanagement.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService{

	@Override
	public List<Book> getBooks() {
		List<Book> li = new ArrayList<>();
		li.add(new Book("101","Arihant","Mathematics"));
		li.add(new Book("102","Caimal","hindi"));
		li.add(new Book("103","Prakash","english"));
		// TODO Auto-generated method stub
		return li;
	}
	

}
