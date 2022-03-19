package advanced.java.program.Assignment3;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		  try{
		      response.setContentType("text/html");
			  PrintWriter pwriter = response.getWriter();
			 
			  HttpSession session=request.getSession(false);
			  
			  String myName=(String)session.getAttribute("uname");
			  String myPass=(String)session.getAttribute("upass");
			  String myAge=(String)session.getAttribute("uage");
			  String myCountry=(String)session.getAttribute("ucountry");
			  String myEmail=(String)session.getAttribute("uemail");
			  pwriter.print("Name: "+myName+" Pass: "+myPass + ", age: " + myAge + ", country: " + myCountry + ", email: " + myEmail );
			  pwriter.print("<br>");
			  pwriter.println("session creation time" + session.getCreationTime());
			  pwriter.println("session last accessed time" +session.getLastAccessedTime());
			  pwriter.println("session max interval time" +session.getMaxInactiveInterval());
			  pwriter.println("session servelt context" +session.getServletContext());
			  pwriter.println("session servelt context" +session.getId());
			  pwriter.println(session.isNew());
			  
				      pwriter.close();
		  }
		  catch(Exception exp){System.out.println(exp);}
		}
}
