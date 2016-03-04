package com.fg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RootServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		// set the response type to be html text
		resp.setContentType("text/html");
		
		// get a request dispatcher and launch a jsp that will render our page
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/root.jsp");
		rd.forward(req, resp);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		// get access to the values
		String text_input = req.getParameter("text_input");
		String date_of_birth = req.getParameter("datetime_input");
		
		// print values to the console to if they were retrieved correctly
		System.out.println("*****************");
		System.out.println("text_input is:" + text_input);
		System.out.println(date_of_birth);
		
		// redirect to / otherwise there will be nothing to display
		resp.sendRedirect("/");
	}
}
