<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="reviewdetails.jsp?" method="get">
		<input type="hidden" name="npersons" id="npersons" value="<%out.print(request.getParameter("npersons"));%>">
		<jsp:useBean id="member" scope="session" class="advance.java.program.BeanLogin"/>
		<input type= "hidden" name="userName" id="userName" value='<jsp:getProperty property="userName" name="member"/>'>
        <input type=hidden  name="flight_number" id="userid" value="<%out.print(request.getParameter("flight_number"));%>">
		Full Name:  <input name="name" placeholder="Name" id="name" maxlength=40 required><br>
		Address:  <input type="text" placeholder="Address" name="add" id="add" maxlength="40" required><br>
		Age:  <input type="number" name="age" placeholder="age(integer)" id="age" min="1" max="100" required><br>
		Phone number: <input type="number" name="pnumber" placeholder="Phone number(integer)" id="pnumber" maxlength=40 required><br>
		Email <input type="email" name="email" placeholder="email" id="email" maxlength=40 required><br>
		Identification: 
	    <select name="ids" id="ids">
		    <option value="SSN">SSN</option>
		    <option value="Passport">Passport</option>
		    <option value="DrivingLicense">Driving License</option>
	    </select>
	    <input name="ci" type="number"  placeholder="Serial Number" id="ci" maxlength=40 required><br>
		Country <input name="country"  placeholder="Country" id="country" maxlength=40 required><br>
		<button>Review Details</button><br>
	</form>

</body>
</html>