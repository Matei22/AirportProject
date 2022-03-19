package advanced.java.program.Assignment2;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class NullOrNot implements Filter {
	FilterConfig filterConfig = null;
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		String userId = request.getParameter("userid");
        String age = request.getParameter("age");
	    if( userId != null && age != null){
	    	response.getWriter().write("<br>");
	    	response.getWriter().write("userid is not null.");
	        chain.doFilter(request, response);
	    	response.getWriter().write("<br>");

	    }else  {
	    	response.getWriter().write("<br>");
	        response.getWriter().write("blocked by NullOrNot filter as there is no userid");
	    }
    }
	public void destroy() {}
	public void init(FilterConfig fConfig) throws ServletException {
		this.filterConfig = fConfig;
	}
}
