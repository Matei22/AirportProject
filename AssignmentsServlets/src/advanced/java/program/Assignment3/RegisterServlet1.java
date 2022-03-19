package advanced.java.program.Assignment3;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response){
	     try{
	      response.setContentType("text/html");
	      PrintWriter pwriter = response.getWriter();

	      String name = request.getParameter("username");
	      String password = request.getParameter("password");
	      String age = request.getParameter("age");
	      String country = request.getParameter("country");
	      String email = request.getParameter("email");

	      pwriter.print("Welcome "+name);
	      pwriter.print("Your password is: "+password);
	      
	      //creating the HttpSession below
	      HttpSession session=request.getSession(); 
	      
	      session.setAttribute("uname",name);
	      session.setAttribute("upass",password);
	      session.setAttribute("uage",age);
	      session.setAttribute("ucountry",country);
	      session.setAttribute("uemail",email);

	      
	      pwriter.print("<a href='registerServlet2'>view details</a>");
	      pwriter.close();
	    }catch(Exception exp){
	       System.out.println(exp);
	     }
	  }
}
