package com.bir;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderServlet extends HttpServlet {
	
	protected void processRequest(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		res.setContentType("html/text");
		try (PrintWriter out = res.getWriter()){
		
			out.println("<!DOCTYPE html>");
			System.out.println("ordered servlet");
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet OrderServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet OrderServlet at " + req.getContextPath()+ "</h1>");
			out.println("</body>");
			out.println("</html>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
