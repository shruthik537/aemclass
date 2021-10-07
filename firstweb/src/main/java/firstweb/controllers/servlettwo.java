package firstweb.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class servlettwo
 */
@WebServlet("/servlettwo")
public class servlettwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlettwo() {
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
		//doGet(request, response);
		
		HttpSession session=request.getSession();
		
		String First=(String)session.getAttribute("fff");
		String Last=(String)session.getAttribute("ggg");
		System.out.println("Hello" +First+"welcome"+Last);
		
		session.removeAttribute("fff");
		session.removeAttribute("ggg");
		
		
		session.invalidate();
		session.setMaxInactiveInterval(0);
		
		if(session!=null)
		{
			System.out.println("session is not null");
		}
		else {
			System.out.println("active");
		}
		}
		
	}


