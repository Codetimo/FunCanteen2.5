package com.funcanteen.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;







public class foodauto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection conn;
	private Bo1 bo=new Bo1();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
                this.doPost(request, response);
	
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		List  food1= bo.getDatas();
		response.setContentType("text/html; charset=utf-8");
		  JSONArray array = JSONArray.fromObject(food1);
		  out = response.getWriter();  
		  String data=array.toString();
		  out.println(data);
		  //System.out.println(array.toString());
		    
	      
	        out.flush();  
	        out.close();
	   
	}

}
