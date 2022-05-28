package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import Sneakers.Sneakers;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		Sneakers sneakers = new Sneakers("Nike",  "Air Force", 123);
	
		out.println("["+sneakers+"]");
	}

}
