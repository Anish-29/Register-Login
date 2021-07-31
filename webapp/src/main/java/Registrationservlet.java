

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import valid.Validation;


@WebServlet({ "/Registrationservlet", "/register" })
public class Registrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int count=0;   
    public Registrationservlet() {
    	super();
    	count++;
    	  
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    String name=request.getParameter("name");
	    String password=request.getParameter("pass");
	    
	   /** if(Validation.register(nn,np)) {
	       response.sendRedirect("index.html");
	    }**/
	    
	    
	    
	    if(Validation.add(name,password)){
	         response.sendRedirect("index.html");
	    }
	}



}
