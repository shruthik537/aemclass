package firstweb.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import firstweb.service.EmployRegister;
import firstweb.serviceimpl.employRegisterimpl;

/**
 * Servlet implementation class EmployRegisterServlet
 */
@WebServlet("/EmployeeregisterServlet")
public class EmployeeregisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeregisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String firstname=request.getParameter("fname");
		String lastname=request.getParameter("lname");
		String email=request.getParameter("email");
		String Password=request.getParameter("pwd");
		System.out.println("firstname-----"+firstname+"lastname-----"+lastname+"email-------"+email+"password------"+Password);
		
		
		EmployRegister obj=new employRegisterimpl();
		obj.employregi(firstname, lastname, email, Password);
	
	}
		
}
