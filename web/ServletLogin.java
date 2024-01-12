package com.training.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class LoginServlet
 */
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		try {
			PrintWriter out = response.getWriter();
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mars_sept","root","12345678sumit");
			String name = request.getParameter("username");
			String password = request.getParameter("password");
			
			PreparedStatement ps = con.prepareStatement("Select uname from user_details where uname =? and password = ?");
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
				
			}
			else {
				out.println("<font color=red size=18> Login Failed!!!<br><br>");
				out.println("<a href = login.jsp> Try Again!!</a>");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}catch(ClassNotFoundException e) {
			
		}
	}

}