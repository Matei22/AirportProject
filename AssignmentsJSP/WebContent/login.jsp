<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login.jsp"> 
		<label>Username:  </label>
		<input type="text" name="uname"> 
		<br>
		<label>Password:</label>
		<input type="password" name="upass">  
		<br>
		<input type="submit" value="login"><br/>  
	</form>  
    <%-- This is JSP comments using JSP COmment tag--%>
    
    <br>
	<%  
	String name=request.getParameter("uname");  
	String pass=request.getParameter("upass");
	if((name != "" && pass != "") && (name != null && pass != null)){
		out.print("Today's date:" +   (new java.util.Date()).toLocaleString() + "<br>");
		out.print("<br> " + "Welcome " + name);  
		out.print("<br>" + "your pass is: " + pass);
		out.print("<br>" + "Servlet name: " + config.getServletName());
		out.print("<br>" + "Servlet context: " + config.getServletContext());
		out.print("<br>" + "a parameter value is: " + application.getInitParameter("a"));
		out.print("<br>" + application.getServerInfo());
	}
	%>  
    <!-- We are on this Page  -->
</body>
</html>