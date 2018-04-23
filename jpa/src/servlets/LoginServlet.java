//DAVID WAGNER + ERIC TOSSELL

//CREATED 2/13/2018
//FINISH v.10 2/16/2018
//FINISH v.2 ASSIGNMENT 2 4/6/2018

//LOGIN SERVLET TO AUTHENTICATE USER CREDENTIALS

package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import db.DBHandler;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	    String name = request.getParameter("username");
	    String pass = request.getParameter("password");
	    

	    
	    
	    if(name.equals(DBHandler.CONNECTION_USER) && pass.equals(DBHandler.CONNECTION_PASSWORD)) {
	    	HttpSession session = request.getSession();
	    	session.setAttribute("user", name);
	   
	    	 request.getRequestDispatcher("./menu.jsp").forward(request, response);		
	    }
	    else {
	    	request.setAttribute("error", "Incorrect credentials!");
	    	request.getRequestDispatcher("./index.jsp").forward(request, response);	
	    }
	    
	  
	
	}

}
