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
	<table border="10px" align="center" style="border-color: red; width: 500px"><br><br>
		<tr>
			<th>SI</th>
			<th>VehicleName</th>
			<th>Stock</th>
			<th>Sales</th>
			<th><a href="insert.jsp"> Click Me For Insert</a></th>
		</tr>
		<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amg", "root", "priyasri@6261");
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("select * from automobile");

		int flag = 0;
		while (rs.next()) {
			int num = rs.getInt("SI");
			String Vname = rs.getString("VehicleName");
			String stockk=rs.getString("Stock");
			String sale=rs.getString("Sales");
			%>
		<tr>
			<td><%=num%></td>
			<td><%=Vname%></td>
			<td><%=stockk%></td>
			<td><%=sale %></td>
			
			<td><a href="upd.jsp?SI=<%=num %>&VehicleName=<%=Vname%>&Stock=<%=stockk%>&Sales=<%=sale%>"> Update</a></td>
			<td><a href="delete?SI=<%=num%>"> Delete</a></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>