package com.goldimaurya;

import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
// how Servlet Know which Servlet is called
// Annotation == 
@WebServlet("/add")
public class AddServlet extends HttpServlet{
	
// HTTP: Hyper Text Transform Protocol
// method of http : get, post,put,delete,options	
	
// creating servlet (add function)
// service method (Servlet method) 	we cannot use any 
//other method method other than servlet (service is servlet component)
// create Object HttpServletRequest and HttpServletResponse  (created by tomcat)
//public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException	
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException  {
	   int i=Integer.parseInt(req.getParameter("num1"));
	   int j=Integer.parseInt(req.getParameter("num1"));
	// convert string into integer using Integer.parseInt()	 
	   
	   int k=i+j;
	   k=k*k;
	   
   // System.out.println("result is" +k); call request to console
	// print output on server using res object .   
	   
	   PrintWriter out = res.getWriter();
	   out.println(" result is " +k);
	}
	   
	   public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException  {
		   int i=Integer.parseInt(req.getParameter("num1"));
		   int j=Integer.parseInt(req.getParameter("num1"));
		// convert string into integer using Integer.parseInt()	 
		   
		// int k=Integer.parseInt(req.grtParameter("k"));
		// simply put ? and after sq and it will redirect it
		// http://localhost:8080/DemoApp/sq?k=9
		   int k=i+j; 	
		// call SqaureServlet
		// 1 . ReqDispacter and Redirect
		   
           //  calling s2 using rd		      
           //RequestDispatcher rd = req.getRequestDispatcher("sq");
           // rd.forward(req,res);
		   
		   // using redirect method
		   // 2(b) : use this  res.sendRedirect("sq?k=9" +k);
		   // 2(a) . creating Http session
		   
		   // HttpSession session = req.getSession();
		   // session.setAttribute("k",k);
		   // 3. using cookie ( client --> cookie(token)-- server
		   // and from client to server
		  
		  Cookie cookie = new Cookie("k" , k + "");
		  res.sendRedirect("sq");
		   
		   res.sendRedirect("sq");
		   
		   // passing value of K to SquareServlet (SessionMangement)
		  // req.setAttribute("k",k); // k value
		 
		   PrintWriter out = res.getWriter();
		   // change background color
		   out.println("<html><body bgcolor='cyan'>");
		   out.println(" result is " +k); 
		   out.println("</body></html>");
	   }
	   
	   
	// query string : where we can send data from client to server 	 
	// web.xml : deployment descriptor 
	}
