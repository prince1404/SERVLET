package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet2 extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		ServletContext context =getServletContext();
		
		String email = context.getInitParameter("email");
		
		PrintWriter out =res.getWriter();
		
		out.print("<h1>Email ="+email+" </h1>");
		
	}

}
