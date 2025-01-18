package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logout")

public class LogoutServlet  extends  HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session =req.getSession(false);
		
		PrintWriter out = resp.getWriter();
		
		if(session !=null) {
			//destroy the session
			session.invalidate();
			
			out.print("<h1>Logout Successfull..");
		}
		
	}

}
