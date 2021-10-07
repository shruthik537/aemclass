package firstweb.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import firstweb.bean.Emp;
import firstweb.service.EmpRegister;
import firstweb.serviceimpl.EmpRegisterImpl;

/**
 * Servlet implementation class Empupdateservlet
 */
@WebServlet("/Empupdateservlet")
public class Empupdateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Empupdateservlet() {
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
		String Id=request.getParameter("id");
		Integer i=Integer.valueOf(Id);
		String Name=request.getParameter("name");
		String Email=request.getParameter("email");
		String Password=request.getParameter("pass");
		String Country=request.getParameter("country");
		System.out.println("id----"+i+"name----"+Name+"email----"+Email+"password----"+Password+"country----"+Country);
		
		
		Emp emp=new Emp();
		
		emp.setId(i);
		emp.setName(Name);
		emp.setEmail(Email);
		emp.setPassword(Password);
		emp.setCountry(Country);
		
		EmpRegister obj=new EmpRegisterImpl();

		obj.update(emp);
		}

}
