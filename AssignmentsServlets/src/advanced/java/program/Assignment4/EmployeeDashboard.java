package advanced.java.program.Assignment4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmployeeDashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
                
            String userId = request.getParameter("username");
            String password = request.getParameter("password");
             
            //creating a new hidden form field
            out.println("<form action='employeeFetch' method='post'>");
            out.println("<input type='hidden' name='username' id='username' value='"+userId+"'>");
            out.println("<input type='hidden' name='password' id='password' value='"+password+"'>");
            out.println("<input type='submit' value='submit' >");
            out.println("</form>");
            out.println("<script>document.forms[0].submit();</script>");         
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           
            doGet(request, response);
    }
}
