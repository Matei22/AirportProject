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
		String userName = request.getParameter("userName");
		String npersons = request.getParameter("npersons");
		String flight_number = request.getParameter("flight_number");
		String name = request.getParameter("name");
		String add = request.getParameter("add");
		String age = request.getParameter("age");
		String pnumber = request.getParameter("pnumber");
		String email = request.getParameter("email");
		String ids = request.getParameter("ids");
		String ci = request.getParameter("ci");
		String country = request.getParameter("country");
	    String dburi = "jdbc:mysql://localhost:3306/db_world";
	    String user = "root";
	    String pass = "root";
	    
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(dburi, user, pass);
			String sql = "insert into booking(FKemail_id, FKflight_number) values('" + userName + "', '" + flight_number + "');";
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		%> 
     	<jsp:useBean id="member" scope="session" class="advance.java.program.BeanLogin"/><br>
        Thank you: <jsp:getProperty name="member" property="userName" /> for your purchase <br>
        <a href="sessionlogout.jsp">Logout</a>

</body>
</html>