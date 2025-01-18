package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SaveServlet extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String gender=req.getParameter("gender");
		Double sal=Double.parseDouble(req.getParameter("sal"));
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root","Maa@1404");
			
			PreparedStatement ps=c.prepareStatement("Insert into employee values(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, gender);
			ps.setDouble(4, sal);
			
			
			ps.executeUpdate();
			
			c.close();
			
			PrintWriter out= res.getWriter();
			
			out.print("<h1> Data saved </h1>");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
