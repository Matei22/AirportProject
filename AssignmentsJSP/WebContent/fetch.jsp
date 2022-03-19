<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="advanced.java.program.Employee" scope="session"></jsp:useBean>
        <jsp:getProperty property="id" name="emp"/><br>  
		<jsp:getProperty property="name" name="emp"/><br>  
		<jsp:getProperty property="age" name="emp" /><br> 
		<jsp:getProperty property="dep" name="emp" /><br> 

</body>
</html>