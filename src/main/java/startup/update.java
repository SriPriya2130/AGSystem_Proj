package startup;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter op=response.getWriter();){
			String num = request.getParameter("SI");
			//int num=Integer.parseInt(Gnum);
			String Vname = request.getParameter("VehicleName");
			String stockk = request.getParameter("Stock");
			String sale = request.getParameter("Sales");
			System.out.println("update.java......"+num+","+Vname+","+stockk+","+sale);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amg", "root", "priyasri@6261");
			Statement stmt = con.createStatement();	
			
			int result=stmt.executeUpdate("Update automobile set VehicleName=  '"+Vname+"',Stock= '"+stockk+"', Sales= '"+sale+"' where SI='"+num+"' ");
			
			
			
			if (result == 1) {
				op.println("Record Updated");
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