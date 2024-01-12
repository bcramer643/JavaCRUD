package com.training.web.dao;
import java.sql.Connection;
import java.sql.DriverManager;




public class UserDAO {
			
public Connection connect() {
	 Connection connection  = null;
	 String jdbcURL = "jdbc:mysql://localhost:3306/mars_sept";
	 String dbUser = "root";
	 String dbPassword = "pass123";

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
	
	 if(connection== null){
         System.out.println("Connection cannot be established");
     }
	 return connection;
     // con.close();
 } catch (Exception e) {
     System.out.println(e);

 }
	return null;
}
}