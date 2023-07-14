package com.url;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestRewiretingA extends HttpServlet
{
  
	private static final long serialVersionUID = 1L;

   public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
  {
    try 
	   {
		   
	   
	res.setContentType("text/html") ; 
	PrintWriter out=res.getWriter();
	
	String n=req.getParameter("userName");
	out.print("Welcome "+n); 
	
	//appending the uesr_name in the query string  
    out.print("<a href='TestRewiretingB?uname="+n+"'>visit</a>");  
              
    out.close(); 
     }
    catch(Exception e)
    {
    	System.out.println(e);
    }
    	
    
    
  }
}
