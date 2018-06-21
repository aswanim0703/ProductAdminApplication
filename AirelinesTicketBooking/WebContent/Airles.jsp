<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="Airlines">
<p>FlightName: <input name="FlightName" type="text" /></p>
<p>Source: <input name="Source" type="text" /></p>
<p>Fare: <input name="fare" type="integer" /></p>
<p>Noofseats: <input name="Seats" type="number" /></p>
<p>Aircraftname: <input name="Aircraftname" type="text" /></p>
<p><input type="submit" value="Add Flight" /></p>  
<p><input type="reset" value="Close" /></p>
</form>
</body>
</html>