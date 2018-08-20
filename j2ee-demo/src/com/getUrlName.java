package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getUrlName extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();

		String uri = request.getScheme() + "://" +   // "http" + "://
        request.getServerName() +       // "loacalhost"
        ":" +                           // ":"
        request.getServerPort() +       // "8080"
        request.getRequestURI() +       // "/people"
        "?" +                           // "?"
        request.getQueryString();       // "lastname=Fox&age=30"
		
		if(request.getServerName().equals("localhost")){
		out.println("u r using local host");
		out.println("</br>");
		}
		
		else if(request.getServerName().equals("127.0.0.1")){
			out.println("u r  using 127.0.0.1");
			out.println("</br>");
		}
		
		else{
			out.println("u r using ip address");
			out.println("</br>");
		}
	}

}
