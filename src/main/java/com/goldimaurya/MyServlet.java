package com.goldimaurya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")
// ServletConfig And ServletContext
public class MyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException ,ServletException {
     
	PrintWriter out = response.getWriter();	
	out.print("Hi<br>");
	
	// creating object of servletConfig (to fetch value of name and phone)
	// ServletContext object created by Tomcat Server
	
	
	// using ServletContext
	//ServletContext ctx = getServletContext();
	//String str = ctx.getInitParameter("name");
	//String str = ctx.getInitParameter("phone");
	
	// using ServletConfig
	ServletConfig cg = getServletConfig();
	String str = cg.getInitParameter("name");
	out.println(str);
  }
}
