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
	<%
	String username = request.getParameter("username");
	String oldPassword = request.getParameter("oldpassword");
	String newPassword1 = request.getParameter("newpassword1");
	String newPassword2 = request.getParameter("newpassword2");

    String dburi = "jdbc:mysql://localhost:3306/db_world";
    String user = "root";
    String pass = "root";
    
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(dburi, user, pass);
		PreparedStatement ps = conn.prepareStatement("select * from login where userName = ?");
		ps.setString(1, username);

		ResultSet rs = ps.executeQuery();
		if(rs.next()){%>
			<%
			if(rs.getString("password").equals(oldPassword)){
				%>
				<%
				if(newPassword1.equals(newPassword2)){
					String sql = "update login set password = '" + newPassword1 + "' where userName = '" + username + "';";
					Statement stmt = conn.createStatement();
					stmt.executeUpdate(sql);
				%>
				<p> You changed successfully the password.
				<a href="searchflights.jsp?userName=<%out.print(request.getParameter("username"));%>">Go to main page</a>
				
				<%
				}
				else{
					%>
					<p> The 2 password doesn't match. Please try again.
					<p> Do you want to abort and go to the main page?
					<a href="searchflights.jsp?userName=<%out.print(request.getParameter("username"));%>">Yes</a>
					<a href="changepass.jsp?userName=<%out.print(request.getParameter("username"));%>">No</a>					
					<%
				}
			}else{
				%>
				<p> This isn't the current password. Please try again.
				<p> Do you want to abort and go to the main page?
				<a href="searchflights.jsp?userName=<%out.print(request.getParameter("username"));%>">Yes</a>
				<a href="changepass.jsp?userName=<%out.print(request.getParameter("username"));%>">No</a>
				<%
			}
		}
		
		conn.close();
	}
	catch(Exception e){
		e.printStackTrace();
	}
	%>
</body>
</html>