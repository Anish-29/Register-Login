import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import valid.Validation;

@WebServlet("/Firstservlet")
public class Firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Firstservlet() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	     
	    
	    String name=request.getParameter("name");
	    String password= request.getParameter("psw");
	    System.out.println(name);
	    
	    HttpSession session=request.getSession();
	    session.setMaxInactiveInterval(30*60);
	    session.setAttribute("username", name);
	    session.setAttribute("password", password);
	    ServletContext cont=getServletContext();
	    String username=cont.getInitParameter("username");
	    
	    String pass=cont.getInitParameter("defaultpassword");
        System.err.println(username+""+pass);
	    
	    
	          /*** if(Validation.check(name,password)) {
	    			RequestDispatcher rd=request.getRequestDispatcher("Secondservlet");
	    		    rd.forward(request, response);
	    		    //response.sendRedirect("Secondservlet");
	    		
	    		}***/
	    
	      if(username.equals(name)&& pass.equals(password)) {
	    	  RequestDispatcher rd=request.getRequestDispatcher("Secondservlet");
  		       rd.forward(request, response);
	      }
	    	
	      else if(Validation.check(name, password)) {
	    	   RequestDispatcher rd=request.getRequestDispatcher("Secondservlet");
   		       rd.forward(request, response);
	       }
	    		else {
	    			response.sendRedirect("index.html");
	    		}
	    	}
	
	    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
	           doGet(request,response);
	}

	

}
