<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  if (request.getParameter("error") != null)
          out.println("<b>Your session has expired or is invalid.</b><br>");
%>
	<form action="sessionlogin.jsp" method="post">
		Name <input name="userName" id="userName" maxlength=40><br>
		Password <input type="password" name="password" id="password" maxlength="10"><br>
		<button>Submit</button><br>

	</form>

</body>
</html>