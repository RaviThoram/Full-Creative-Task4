package com.chandu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SerializeData
 */
@WebServlet("/loginuser")
public class loginuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String username;
	public String password;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		username = request.getParameter("uname2");
		password = request.getParameter("pass2");

		HttpSession session = request.getSession(false);

		String userName = (String) getServletContext().getAttribute(username + "session");
		String passWord = (String) getServletContext().getAttribute(username + "passsession");
		try {
			if (userName.equals(username) && passWord.equals(password)) {
				PrintWriter out = response.getWriter();
				out.print("<a href='https://www.google.com'>Click If U Want To Browse</a>");
			} else {
				response.sendRedirect("authenticate.jsp");
			}
		} catch (NullPointerException e) {
			response.sendRedirect("login.jsp");
		}

	}
}