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
		PreparedStatement ps = conn.prepareStatement("select * from flight_details where flight_number = ?");
		ps.setString(1, flight_number);

		ResultSet rs = ps.executeQuery();
		while(rs.next()){
	%>
		<jsp:useBean id="member" scope="session" class="advance.java.program.BeanLogin"/>
		<p>The airline name: <%=rs.getString("airline_name") %><br>
		<p>You will have to pay: <%=rs.getString("price") %><br>
		<p>From which city will departure: <%=rs.getString("source_city") %><br>
		<p>The arrival city: <%=rs.getString("destination_city") %><br>
		<p>You have to be in: <%=rs.getString("source_city") %> at <%=rs.getString("date_of_travel") %><br>
		<p>You will departure at: <%=rs.getString("departure_time") %><br>
		<p>You will arrive at: <%=rs.getString("arrival_time") %><br>
		<a href="confirmation.jsp?flight_number=<%out.print(request.getParameter("flight_number"));%>&userName=<jsp:getProperty property="userName" name="member"/>">Purchase</a>
				
	<%
		}
		String sql = "insert into register_details values('" + name + "', '"+ add + "', '" + age + "', '" + pnumber + "', '" + email +  "', '" + ids +""+ ci + "', '" + country+"');";
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		sql = "";
	conn.close();
	}
	catch(Exception e){
		e.printStackTrace();
	}
	%>
	
</body>
</html>