package com.sj.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sj.dao.BookDAO;
@Repository
public class OnlineBookService implements BookService {
@Autowired
	BookDAO dao;
	
	@Override
	public Book createBook(Book book) throws SQLException {
	
			try {
				return dao.insertBook(book);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return book;
		
}
}
