<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="emp" scope="session" class="advanced.java.program.Employee"/>
		<jsp:setProperty property="*" name="emp"/>  
	

	<a href="fetch.jsp">The info about you</a>
	<a href="fetch1.jsp">Logout</a>
	
	<jsp:text>
        <![CDATA[Footer]]>
</jsp:text>
</body>
</html>