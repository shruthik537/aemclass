package firstweb.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import firstweb.dbutil.Dbutil;
import firstweb.service.Dbutilinterface;
import firstweb.service.EmployRegister;
import firstweb.serviceimpl.Dbutilimpl;
import firstweb.serviceimpl.employRegisterimpl;

/**
 * Servlet implementation class Dbutilservlet
 */
@WebServlet("/Dbutilservlet")
public class Dbutilservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dbutilservlet() {
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

		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String age=request.getParameter("age");

		System.out.println("id-----"+id+"name-----"+name+"age-------"+age);
		
		
		Dbutilinterface obj=new Dbutilimpl();
		obj.emp(id,name,age);

	}

}
