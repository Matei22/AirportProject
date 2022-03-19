package advanced.java.program.Assignment4;

import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response){
	     try{
	      response.setContentType("text/html");
	      PrintWriter pwriter = response.getWriter();

	      String name = request.getParameter("username");
	      String password = request.getParameter("password");
	      String age = request.getParameter("age");
	      String city = request.getParameter("city");
	      String gender = request.getParameter("gender");
	      String email = request.getParameter("email");

	      pwriter.print("Welcome "+name);
	      pwriter.print("Your password is: "+password);
	      
	      //creating the HttpSession below
	      HttpSession session=request.getSession(); 
	      
	      session.setAttribute("uname",name);
	      session.setAttribute("uage",age);
	      session.setAttribute("ucity",city);
	      session.setAttribute("ugender",gender);
	      session.setAttribute("uemail",email);

	      
	      pwriter.print("<a href='storeData'>view details</a>");
	      pwriter.close();
	    }catch(Exception exp){
	       System.out.println(exp);
	     }
	  }

}
