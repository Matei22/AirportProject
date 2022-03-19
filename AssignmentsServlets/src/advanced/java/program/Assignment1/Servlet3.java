package advanced.java.program.Assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
    	PrintWriter pw=res.getWriter();
		res.setContentType("text/html");

		ServletConfig config=getServletConfig();  // Step 1: instantiate ServeltConfig
		ServletContext context = getServletContext();
		
		String s1=context.getInitParameter("a");   //Step 2: fetching the parameters from the web.xml
		String s2=context.getInitParameter("b");
		String s3=context.getInitParameter("c");
		String s4=config.getInitParameter("d");
		
		double a = parseDoubleSafely(s1);
		double b = parseDoubleSafely(s2);
		double c = parseDoubleSafely(s3);
		double d = parseDoubleSafely(s4);

		pw.println("a value is: " +a+ ", b is: " +b+ " and d is: " + d);
		pw.println("The sum of a+b+d is: " + (a + b + d));
		pw.println("the max value from the four of the variables is: " + max(max(max(a,b),c),d));
	   pw.close();	
	}
    
    public static double parseDoubleSafely(String str) {
        double result = 0;
        try {
            result = Double.parseDouble(str);
        } catch (NullPointerException npe) {
            
            return 0; 
        } catch (NumberFormatException nfe) {
           
            return 0; 
        }
        return result;
    }
    
    public static double max(double a, double b) {
    	if(a>b) return a;
    	else return b;
    	
    }


}
