package com.goldimaurya;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DempServlet")
public class DemoServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException  {
      //JSTL ---> JSP Standard Tag Library
		
		String name ="Goldi";
		
		// use object from StudentDemo
		
		//StudentDemo sd = new StudentDemo(1,"name");
		//request.setAttribute("student", name);
		request.setAttribute("label", name);
		RequestDispatcher rd =request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
   }
	// to print multiple object Array or List
	// create ArrayList
	//List<StudentDemo> student =Arrays.asList(new StudentDemo(1,"student1"),new StudentDemo(2,"student2"),new StudentDemo(3,"student3"));
	//request.setAttribute("students",student );
	// write this in Display.jsp
	//<! –– <c:forEach items="${Students}" var="s" ––>  (to print loop)
}
