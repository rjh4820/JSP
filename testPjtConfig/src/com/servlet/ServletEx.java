package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminId2 = getServletConfig().getInitParameter("adminId2");
		String adminPw2 = getServletConfig().getInitParameter("adminPw2");
		PrintWriter out = response.getWriter();
		out.print("<p>adminId2 : " + adminId2 + "</p>");
		out.print("<p>adminPw2 : " + adminPw2 + "</p>");
		
		String imgDir = getServletContext().getInitParameter("imgDir");
		String testServerIP = getServletContext().getInitParameter("testServerIP");
		String realServerIP = getServletContext().getInitParameter("realServerIP");
		
		out.print("<p>imgDir2 : " + imgDir + "</p>");
		out.print("<p>testServerIP2 : " + testServerIP + "</p>");
		out.print("<p>realServerIP2 : " + realServerIP + "</p>");
	
		getServletContext().setAttribute("connectedIP", "192.1.1.1");
		String cIP = (String)getServletContext().getAttribute("connectedIP");
		
		out.print("<p>connectedIP : " + cIP + "</p>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
