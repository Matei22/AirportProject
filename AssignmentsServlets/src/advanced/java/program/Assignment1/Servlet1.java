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

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
    	PrintWriter pw=res.getWriter();
		res.setContentType("text/html");

		ServletConfig config=getServletConfig();  // Step 1: instantiate ServeltConfig
		ServletContext context = getServletContext();
		int a1= Integer.parseInt(context.getInitParameter("a")); 
		int b1= Integer.parseInt(context.getInitParameter("b"));   
		int c1= Integer.parseInt(context.getInitParameter("c"));   
		int d1= Integer.parseInt(config.getInitParameter("d"));   

		
		String s1=context.getInitParameter("a");   //Step 2: fetching the parameters from the web.xml
		String s2=context.getInitParameter("b");
		String s3=context.getInitParameter("c");
		String s4=config.getInitParameter("d");

		double a = parseDoubleSafely(s1);
		double b = parseDoubleSafely(s2);
		double c = parseDoubleSafely(s3);
		double d = parseDoubleSafely(s4);

		pw.println("Using non built in functions:"+ "<br> </br>"+" a value is: " +a+ ", b is: " +b + ", c is: " +c + " and d is: " + d + "<br> </br>");
		pw.println("total is: " + (a+ b + c + d) + "<br> </br>");		
		pw.println("Using built in function:"+ "<br> </br>"+" a value is: " +a1+ ", b is: " +b1 + ", c is: " +c1 + " and d is: " + d1 + "<br> </br>");
		pw.println("total is: " + (a1+ b1 + c1 + d1));		
	   pw.close();	
	}
    //first way, using a non-built in function
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
