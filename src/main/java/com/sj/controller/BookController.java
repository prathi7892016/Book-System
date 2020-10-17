package com.sj.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sj.service.Book;
import com.sj.service.BookService;
@RestController
@RequestMapping(value="/web")
public class BookController {
	@Autowired
	BookService service;
	
	@RequestMapping(value="/book")
	public Book insertBook(Book book) throws SQLException {
		System.out.println(book);
		return service.createBook(book);
	}
	

}
