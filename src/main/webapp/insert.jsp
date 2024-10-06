<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<fieldset style="background-color: yellow; height:200px; width: 500px" >
	<table>
	<form  action="insert" method="get" >
	<label>Insert Page</label><br><br>
	<tr>
	<td><label>VehicleName:</label>
	</td>
	<td><input type="text" name="VehicleName">
	</td>
	</tr>
	<tr>
	<td><label>Stock:</label>
	</td>
	<td><input type="number" name="Stock">
	</td>
	</tr>
	<tr>
	<td><label>Sales:</label>
	</td>
	<td><input type="number" name="Sales">
	</td>
	</tr>
	<tr>
	<td>
	</td>
	<td><input type="submit" value="Enter">
	</td>
	</tr>
	</form>
	</table>
	</fieldset>
	</center>
	
</body>
</html>

