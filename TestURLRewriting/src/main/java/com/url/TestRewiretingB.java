    package com.url;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestRewiretingB extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

  public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
  {
   try 
   {
	   
	 res.setContentType("text/html");  
	 PrintWriter out=res.getWriter();
	 
	 //getting value from the query string  
     String n=req.getParameter("uname");  
     out.print("Hello "+n);  
     
     out.close(); 
     
   }
   catch(Exception e)
   {
	  System.out.println(e);
   }
   
  }
}
