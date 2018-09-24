package com.bi.interceptor;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DoublePostingPreventionInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		int sToken=0;
		HttpSession ses=null;
		
		//get Session object
		ses=request.getSession();
		
		if(request.getMethod().equalsIgnoreCase("GET")) {
			//create a server side token
			sToken=10;
			//set Serverside token to the form
			ses.setAttribute("sToken", sToken);	
			//return true;
		}
		else {
			//get the client side token
			int cToken=Integer.parseInt((request.getParameter("cToken")));
			//int sToken=ses.getAttribute("sToken");
			if(cToken==(Integer)ses.getAttribute("sToken")) {
				ses.setAttribute("sToken", 20);
				//return true;
			}else {
				RequestDispatcher rd=request.getRequestDispatcher("dblposterror.jsp");
				rd.forward(request, response);
			}
		}
		return super.preHandle(request, response, handler);
	}
}
