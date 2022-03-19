<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*,java.sql.*, com.mysql.jdbc.Driver"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>

<form action="passchangeinsql.jsp">
     <jsp:useBean id="member" scope="session" class="advance.java.program.BeanLogin"/><br>
        <jsp:getProperty name="member" property="userName" /> , you chose to change the password <br>
	
	<input type="hidden" id="usernamee" name="username" value="<%out.print(request.getParameter("userName"));%>"><br>
	<label>Please insert your current password:</label>
	<input type="password" id="pswo" name="oldpassword"><br>
	<label>Please insert your new password</label>
	<input type="password" id="pswn1" name="newpassword1"><br>
	<label>Please reinsert your new password</label>
	<input type="password" id="pswn2" name="newpassword2"><br>
	<button>Submit</button>
</form>
	
</body>
</html>