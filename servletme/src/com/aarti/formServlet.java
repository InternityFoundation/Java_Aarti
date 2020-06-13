package com.aarti;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet(name ="abc" , urlPatterns="/message")
public class formServlet extends HttpServlet 
{

	/**
	 * 
	 */private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		String i = req.getParameter("name");
		int j= Integer.parseInt(req.getParameter("rollno"));
	
		PrintWriter out = res.getWriter();
		
		out.println(" Your Name is="+i);
		out.println("Your Roll Number is ="+j);
		
		
		
	}
}
