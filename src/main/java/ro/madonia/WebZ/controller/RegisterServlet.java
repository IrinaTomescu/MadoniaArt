package ro.madonia.WebZ.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by irina on 7/28/2016.
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends javax.servlet.http.HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws javax.servlet.ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String n = request.getParameter("userName");
		String p = request.getParameter("userPass");
		String e = request.getParameter("userEmail");

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("com.mysql.cj.jdbc.Driver", "root", "root");

			PreparedStatement ps = con.prepareStatement("insert into users values(null,?,?,?)");

			ps.setString(1, n);
			ps.setString(2, p);
			ps.setString(3, e);
		

			int i = ps.executeUpdate();
			if (i > 0)
				out.print("You are successfully registered...");

		} catch (Exception e2) {
			System.out.println(e2);
		}

		out.close();
	}

	protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
			throws javax.servlet.ServletException, IOException {

	}
}
