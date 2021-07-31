

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Secondservlet")
public class Secondservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Secondservlet() {
        super();
    
    }

	
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out=response.getWriter();
	    

	    HttpSession session=request.getSession(false);
	    String name=(String) session.getAttribute("username");	

	    if(session.getAttribute("username")==null) {
	    	response.sendRedirect("index.html");
	    }
	    else{
	    	
	    	out.println("<h1>Welcome "+name+"<h1>");
	        request.getRequestDispatcher("logout.html").include(request, response);	
	    }
	    
	    
	   
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doGet(request,response);
	    
	   
	}
	

}
