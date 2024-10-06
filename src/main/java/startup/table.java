package startup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/table")
public class table extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out=response.getWriter();){
			response.setContentType("text/html");
			String user=request.getParameter("Id");
			String pass=request.getParameter("Pwd");
			
			if(user.equals("admin")&& pass.equals("admin123")){
			out.println("Welcome to Automobile Garage System");
			
			RequestDispatcher rd=request.getRequestDispatcher("table.jsp");
			rd.include(request,response);
			}
			else {
				out.println("Sorry Username Password is Incorrect");
			}
		}
				catch(Exception e){
				System.out.println();
			}		
	}
}

