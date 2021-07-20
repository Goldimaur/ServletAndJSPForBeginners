package com.goldimaurya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException ,ServletException {
	
	//fetch request (K)	
	//2.  creating Http Session
	HttpSession session =req.getSession();	
	// want to delete data value simply use 
	// session.removeAttribute("k");
	//int k=(int) req.getAttribute("k");	
	int k=0;
	Cookie cookies[] = req.getCookies();
	// multiple cookie is used so use array
	
	for(Cookie c : cookies) {
		if(c.getName().equals("k"))
			k=Integer.parseInt(c.getValue());
	}
	k=k*k;
    //	PrintWriter out = res.getWriter();	
    //	out.print("result is" + k);
	
	// using redirect method
	System.out.println("sq called");
 }
}
