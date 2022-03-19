<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search flights</title>
</head>
<body>
	<form action="flightpage.jsp" method="get">
		 <label>Travel date: </label>
		 <input type="date" id="date" name="date" required><br>
		 <label>Departure city: </label>
		 <input type="text" id="dcity" name="dcity" required><br>
		 <label>Arrival city: </label>
		 <input type="text" id="acity" name="acity" required><br>
		 <label>Number of people: </label>
		 <input type="number" id="npersons" name="npersons" required>
		 <br>
		 <button>Search</button>
	</form>

</body>
</html>