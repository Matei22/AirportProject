package advanced.java.program.Assignment2;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginFilter implements Filter {
	FilterConfig filterConfig = null;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
 
        String userId = request.getParameter("userid");
        String age = request.getParameter("age");
        System.out.println("age: " + age);
        System.out.println(age == "30");
        System.out.println("Id: " + userId);
        System.out.println(userId == "admin");
        

        if( userId.equals("admin") && age.equals("30")){
	    	response.getWriter().write("<br>");
        	response.getWriter().write("Logged in");
            chain.doFilter(request, response);
	    	response.getWriter().write("<br>");

        }else{ 
	    	response.getWriter().write("<br>");
	    	response.getWriter().write("Entered else statment");
	    	response.getWriter().write("<br>");
            response.getWriter().write("Doesn't match admin or age != 30");
            
        }
        }

    public void init(FilterConfig fConfig) throws ServletException {
		this.filterConfig = fConfig;

    }
    public void destroy() {}
}

