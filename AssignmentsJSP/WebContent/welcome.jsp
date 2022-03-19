<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%-- This is JSP comments using JSP COmment tag--%>
    Today's date: <%= (new java.util.Date()).toLocaleString()%>
    <br>
	<%  
	String name=request.getParameter("uname");  
	String pass=request.getParameter("upass");
	out.print("welcome "+name);  
	out.print("<br>" + "your pass is: " + pass);
	%>  
	<br><br><br>
	
	Expression Tag:::: Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
	<br>
	<%= "Welcome "+ request.getParameter("uname") %>  
	<br><br><br>
	
	Declaration Tag::: 
	<%! int data=50; %>  
    <%= "Value of the variable is:"+ data %>  
    <br>
    <%="Servlet name: " + config.getServletName() %>
    <br>
    <%="Servlet context: " + config.getServletContext() %>
    <br>
    <%="a parameter: " + application.getInitParameter("a") %>
    <br>
    <%=application.getServerInfo() %>
    <!-- We are on this Page  -->
</body>
</html>