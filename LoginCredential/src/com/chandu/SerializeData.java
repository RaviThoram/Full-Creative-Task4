package com.chandu;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SaveData
 */
@WebServlet("/SerializeData")
public class SerializeData extends HttpServlet implements Serializable {
	private static final long serialVersionUID = 1L;
	public String username1;
	public String password1;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		username1 = request.getParameter("uname1");
		password1 = request.getParameter("pass1");
		
		HttpSession session=request.getSession();
		ServletContext context=session.getServletContext();
      context.setAttribute(username1+"session", username1);
      context.setAttribute(username1+"passsession", password1);
				response.sendRedirect("login.jsp");

	}





}
