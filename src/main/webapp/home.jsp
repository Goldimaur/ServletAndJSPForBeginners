<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Hello World! </h1>
   <%
   pageContext.setAttribute("name","goldi",PageContext.SESSION_SCOPE);   
   out.println(7+5);
   try{
   int k=9/0;
   }
   catch(Exception e){
	   out.println("Error" + e.getMessage());
   }
   %>
</body>
</html>