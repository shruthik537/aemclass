package firstweb.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginfilterservlet
 */
@WebServlet("/loginfilterservlet")
public class loginfilterservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginfilterservlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response, HttpSession HttpSession) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String user=request.getParameter("user");
		String pass=request.getParameter("pwd");
		//System.out.println("user---"+user+"pass----"+pass);
		
		if(user.equalsIgnoreCase(user)&&pass.equalsIgnoreCase(pass)) {
			HttpSession session=request.getSession();
			session.setAttribute("user","pankaj");
			session.setMaxInactiveInterval(30*60);
			Cookie username=new Cookie("user", user);
			username.setMaxAge(30*60);
			response.addCookie(username);
			response.sendRedirect("LoginSuccess.html");
			
			
		}
		else {
			RequestDispatcher rd=request.getServletContext().getRequestDispatcher("loginpage.html");
			PrintWriter out=response.getWriter();
			System.out.println("<font color=red>Either username of password is wrong</font>");
			rd.include(request, response);
			
			
		}
		
		}
		
	}

