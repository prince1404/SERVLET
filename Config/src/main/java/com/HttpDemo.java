package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getHttpDemo")
public class HttpDemo  extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServerException {
		
		PrintWriter out = res.getWriter();
		
		out.print("<h1> hi this is POST method");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServerException {
		
		PrintWriter out = res.getWriter();
		
		out.print("<h1> hi this is GET method");
	}

}
