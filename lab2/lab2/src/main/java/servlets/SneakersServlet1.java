package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import Sneakers.Sneakers;
import crud.Lab2CrudInterface;

/**
 * Servlet implementation class SneakersServlet1
 */
public class SneakersServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ServletConfigInterface servletConfig;
	Lab2CrudInterface lab2Crud;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SneakersServlet1() {
        super();
        this.servletConfig = new ServletConfig();
        this.lab2Crud = servletConfig.getCrud();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("["+lab2Crud.readSneakers()+"]");
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String desc = request.getParameter("desc");
		int size = Integer.parseInt(request.getParameter("size"));
	
		lab2Crud.updateSneakers(new Sneakers(title, desc, size));
	}

}
