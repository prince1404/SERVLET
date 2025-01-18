package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FormServlet extends GenericServlet{
	
	//we are connecting frontend to backend by using Query parameter(key=value)
	//http://localhost:8080/DemoServlet/form?id=1&name=prince
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
		
		String id= req.getParameter("id");
		String name= req.getParameter("name");
		
		String html = "<html> <body> <h1> ID =  "+id+" ,  NAME = "+name+" </h1> </body></html>";
		
		PrintWriter out =res.getWriter();
		out.print(html);

	}

}
