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
	<!-- to do: SQL tags to retrieve the details of the flight from database -->
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/db_world"  
     user="root"  password="root"/>  
    <jsp:useBean id="search" scope="session" class="advance.java.program.BeanRegister"/>
		<jsp:setProperty property="*" name="search"/>  
     <h2 align="center"><font><strong>These are the available flights</strong></font></h2>
	<table align="center" cellpadding="5" cellspacing="5" border="1">
		<tr>
		
		</tr>
		<tr bgcolor="#A52A2A">
			<td><b>ID</b></td>
			<td><b>Airline</b></td>
			<td><b>Price</b></td>
			<td><b>Departure city</b></td>
			<td><b>Arrival City</b></td>
			<td><b>Departure time</b></td>
			<td><b>Arrival time</b></td>
			<td><b>Capacity</b></td>
			<td><b>Booked seats</b></td>
			<td><b>Available seats</b></td>
			<td><b>Departure date</b></td>
			<td><b>Economic</b></td>
		</tr>
	     <%
	        String tdate = request.getParameter("date");
	        String dcity = request.getParameter("dcity");
	        String acity = request.getParameter("acity");
	        String npersons = request.getParameter("npersons");
	
	        String dburi = "jdbc:mysql://localhost:3306/db_world";
	        String user = "root";
	        String pass = "root";
	        
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection(dburi, user, pass);
				PreparedStatement ps = conn.prepareStatement("select * from flight_details where date_of_travel = ? and source_city = ? and destination_city = ?  and seat_availability >= ?");
				ps.setString(1, tdate);
				ps.setString(2, dcity);
				ps.setString(3, acity);
				ps.setString(4, npersons);
	
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
		%>
					<tr bgcolor="#DEB887">
						<td><a href="registerdetails.jsp?flight_number=<%=rs.getString("flight_number") %>&npersons=<%out.print(npersons); %>"><%=rs.getString("flight_number") %></a></td>
						<td><%=rs.getString("airline_name") %></td>
						<td><%=rs.getString("price") %></td>
						<td><%=rs.getString("source_city") %></td>
						<td><%=rs.getString("destination_city") %></td>
						<td><%=rs.getString("departure_time") %></td>
						<td><%=rs.getString("arrival_time") %></td>
						<td><%=rs.getString("total_seats") %></td>
						<td><%=rs.getString("booked_seats") %></td>
						<td><%=rs.getString("seat_availability") %></td>
						<td><%=rs.getString("date_of_travel") %></td>
						<td><%=rs.getString("is_economic") %></td>
					</tr>
			<% 
				}
			conn.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			%>
	</table>

</body>
</html>