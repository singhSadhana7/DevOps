package com.library.librarymanagement.model;

import java.io.Serializable;

public class Book implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 6472327406155779212L;
	/**
	 * 
	 */
	
	private String id;
	private String publication;
	private String subject;
	public Book(String id, String publication, String subject) {
		this.id=id;
		this.publication=publication;
		this.subject = subject;
		// TODO Auto-generated constructor stub
	}

}
