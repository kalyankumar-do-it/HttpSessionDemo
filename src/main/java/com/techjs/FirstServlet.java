package com.techjs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// Create a seesion Object and set data 
        HttpSession session = req.getSession();
        resp.setContentType("text/html");
        session.setAttribute("eName",req.getParameter("eName"));
        
        PrintWriter out = resp.getWriter();
        out.println("<form action='second'> <input type='submit'> <input type='hidden' value='testvalue'> </form>");
        out.close();
        
	}

}
