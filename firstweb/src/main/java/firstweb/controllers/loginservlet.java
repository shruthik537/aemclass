package firstweb.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
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
		
		String user=request.getParameter("uname");
		String paswrd=request.getParameter("pass");
		System.out.println("username"+user+"password"+paswrd);
		
		if(user.equalsIgnoreCase("shruthi")&&paswrd.equalsIgnoreCase("mitra")) {
			response.sendRedirect("success.html");
				RequestDispatcher rd=request.getRequestDispatcher("./success.html");
				
				
			
		}else {
			response.sendRedirect("failure.html");
			
			RequestDispatcher rd=request.getRequestDispatcher("./failure.html");
			
			
		}
				}

}
