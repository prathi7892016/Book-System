package com.sj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.sj.service.Book;
@Repository
public class BookDAO
{
	public BookDAO() throws ClassNotFoundException{
		super();
	}

public Book insertBook(Book book) throws SQLException, ClassNotFoundException  {

	
		
	
			Connection con = new DBConnector().getConnection();
	
			
		PreparedStatement pst= con.prepareStatement("insert into springbook values(?,?,?,?)");
	pst.setInt(1,101);
	pst.setString(2, "Chetan Bhagat");
	pst.setString(3,"Steve");
	pst.setInt(4,20);
	pst.executeUpdate();
	return book;
	}
	

}
