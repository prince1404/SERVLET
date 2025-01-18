package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class StaticServlet extends GenericServlet {
	public void service(ServletRequest Req, ServletResponse Res) throws IOException, ServletException {
		
		String html = "<html> <body> <h1>  welcome to static </h1> </body></html>";

		PrintWriter out = Res.getWriter();
		out.print(html);

	
	}
}
