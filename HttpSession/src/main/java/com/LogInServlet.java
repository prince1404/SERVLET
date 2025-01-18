package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LogInServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("email");
		String password =req.getParameter("password");
		
		String ex_email="tom@gmail.com";
		String ex_password="123";
		
		PrintWriter out=resp.getWriter();
		
		if(email.equals(ex_email)) {
			if(password.equals(ex_password)) {
				//create session
				HttpSession session =req.getSession(true);
				
				out.print("<h1>LogIn Successful!!");
				out.print("<h1>Session Created");
			}
			else {
				out.print("<h1>Incorrect Password</h1>");
			}
		}else {
			out.print("<h1>Email not found  </h1>");
		}
		
	}
	
}
