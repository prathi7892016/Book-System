package com.sj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
static DBConnector conn;
public DBConnector() throws ClassNotFoundException{ 
	super();
	Class.forName("com.mysql.jdbc.Driver");
}
public static DBConnector getInstance() throws ClassNotFoundException{
	
		if(conn==null)
		conn= new DBConnector();
		
		return conn;
	
}
public  Connection getConnection() throws SQLException{
	return DriverManager.getConnection("jdbc:mysql://localhost:3306/schemaone","root","Pra98th#");
}
}



/*
 * public class DBConnector { static DBConnector db; public DBConnector() {
 * super(); } public static DBConnector getInstance() { if(db== null); db= new
 * DBConnector();
 * 
 * return db; } public static Connection getConnection() throws SQLException {
 * return(DriverManager.getConnection("jdbc:mysql://localhost:3306/schemaone",
 * "root", "Pra98th#")); } }
 */