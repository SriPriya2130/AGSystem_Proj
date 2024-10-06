package startup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter op=response.getWriter()){
			
			//String num = request.getParameter("SI");
			String Vname = request.getParameter("VehicleName");
			String stockk=request.getParameter("Stock");
			String sale=request.getParameter("Sales");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amg", "root", "priyasri@6261");
			Statement stmt = con.createStatement();	
			
			int result=stmt.executeUpdate("insert into  automobile (SI, VehicleName, Stock, Sales) Values (default, '"+Vname+"' ,'"+stockk+"','"+sale+"')");
			if (result == 1) {
				//op.println("Record Inserted...");
				//op.println("<a href='automobileadmin.jsp'>back</a>");
				response.sendRedirect("table.jsp");
			}
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}





