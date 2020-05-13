package com.ServletEx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/seg")
public class ServletGet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String connetedIP =(String)getServletContext().getAttribute("connetedIP");
		String connetedUser =(String)getServletContext().getAttribute("connetedUser");
		
		PrintWriter out = response.getWriter();
		out.print("<p>connetedIP :" + connetedIP + "</p>");
		out.print("<p>connetedUser :" + connetedUser + "</p>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
