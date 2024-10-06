<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body style="background-color: lightpink">
<center>
<fieldset style="background-color: skyblue; height:200px; width: 300px; margin-top:100px">
<form  action="update" method="get">
<%
out.println("<label><b>Update Page</b></label><br><br>");
	
String num = request.getParameter("SI");
//int num=Integer.parseInt(Gnum);
String Vname = request.getParameter("VehicleName");
String stockk = request.getParameter("Stock");
String sale = request.getParameter("Sales");
System.out.println("upd.jsp......"+num+","+Vname+","+stockk+","+sale);

		%>
		
<table>
		<tr>
	<td><label>SI:</label></td><td><label>VehicleName:</label>
	</td><td><label>Stock:</label>
	</td><td><label>Sales:</label>
	</td></tr>
	<tr>
	<td><input type="text" name="SI" value="<%=num %>"  />
	</td>
	
	<td><input type="text" name="VehicleName" value="<%=Vname %>" />
	</td>
	
	<td><input type="text" name="Stock" value="<%=stockk %>" />
	</td>
	
	<td><input type="text" name="Sales" value="<%=sale %>" />
	</td>
	</tr>

	</table>
	<div style="padding-left: 60px;"><input type="submit" value="Update" style="background-color: gold" ><div>
	
	</form>
	</fieldset>
	</center>
</body>
</html>
