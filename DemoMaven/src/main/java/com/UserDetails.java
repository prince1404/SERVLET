package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 
public class UserDetails extends GenericServlet{
	
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
		
		
		String name= req.getParameter("name");
		String age= req.getParameter("age");
		String gender= req.getParameter("gender");
		String phone=req.getParameter("phone");
		
		String html = "<html> <body> <h1> NAME = "+name+", AGE = "+age+" , GENDER = "+gender+", PHONE = "+phone+" </h1> </body></html>";
		
		PrintWriter out =res.getWriter();
		out.print(html);
	}

}
