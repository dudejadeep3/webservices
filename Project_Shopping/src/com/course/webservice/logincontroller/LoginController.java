package com.course.webservice.logincontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 * Login Controller for the seller Logins.
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * Checking the username and password. If credentials are matching then we are taking the user to the landing page for sellers.
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId= request.getParameter("userId");
		String password = request.getParameter("password");
		boolean loggedIn=false;
		if(userId.equals("admin") && password.equals("admin")){
			loggedIn=true;
		}
		RequestDispatcher requestDispatcher=null;
		if(loggedIn){
			requestDispatcher=request.getRequestDispatcher("/jsps/seller.jsp");
			requestDispatcher.forward(request, response);
		}
		else{
			request.setAttribute("message", "Invalid User Id or Password");
			requestDispatcher=request.getRequestDispatcher("/jsps/sellerLogin.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}
