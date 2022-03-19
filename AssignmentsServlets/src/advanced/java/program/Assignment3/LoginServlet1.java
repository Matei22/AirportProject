package advanced.java.program.Assignment3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
	    Cookie userId = new Cookie("username", request.getParameter("username"));
	    Cookie password = new Cookie("password", request.getParameter("password"));
        response.addCookie(userId);
        response.addCookie(password);
        response.sendRedirect("loginServlet2");               
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
	       doGet(request, response);
	}

}
