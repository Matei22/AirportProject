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

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
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

		pw.println("a value is: " +a+ ", b is: " +b + ", c is: " +c + " and d is: " + d);
		pw.println("a * b is: " + (a * b));	
		pw.println("b - c is: " + (b - c));		

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

}
