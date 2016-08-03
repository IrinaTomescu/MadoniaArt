package ro.madonia.WebZ.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ro.madonia.WebZ.entities.User;
import ro.madonia.WebZ.service.LoginService;

/**
 * Created by irina on 7/28/2016.
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends javax.servlet.http.HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws javax.servlet.ServletException, IOException {
		LoginService login = new LoginService();

		String username = request.getParameter("username");
		String password = request.getParameter("password");
System.out.println("login attemt user:" + username + " pass:" + password);
		User user = login.doLogin(username, password);
		if (user == null) {
			String nextJSP = "/register.jsp";
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
			dispatcher.forward(request, response);
		} else {
			request.getSession().setAttribute("user", user);
			String nextJSP = "/logged.jsp";
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
			dispatcher.forward(request, response);
		}
	}

	protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
			throws javax.servlet.ServletException, IOException {

	}
}
