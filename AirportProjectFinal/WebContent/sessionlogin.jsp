<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*,java.sql.*, com.mysql.jdbc.Driver"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/db_world"  
     user="root"  password="root"/>  
     	<jsp:useBean id="member" scope="session" class="advance.java.program.BeanLogin"/>
		<jsp:setProperty property="*" name="member"/> 
<%
        String name = request.getParameter("userName");
        String pwd = request.getParameter("password");
        String dburi = "jdbc:mysql://localhost:3306/db_world";
        String user = "root";
        String pass = "root";
        
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(dburi, user, pass);
			PreparedStatement ps = conn.prepareStatement("select * from login where username = ? and password = ?");
			ps.setString(1, name);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){%>
			<p> If you want to change the password please press yes:
			<a href="changepass.jsp?userName=<%out.print(request.getParameter("userName"));%>">Yes</a> <br>
			<a href="searchflights.jsp">No</a><br>

<% 
			}
			else if (name == null || name.equals("") || pwd == null || pwd.equals("")) {
		        response.sendRedirect("loginscreen.jsp?error=1");
		    } 
			else {
				out.println("You cant log in, username and password doesn't match with any record in the database");
				%>
				<a href="loginscreen.jsp">Login again</a>
				<%
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
        
%>

</body>
</html>