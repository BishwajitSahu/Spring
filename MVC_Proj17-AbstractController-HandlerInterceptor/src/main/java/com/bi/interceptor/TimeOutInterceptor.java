package com.bi.interceptor;

import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeOutInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Calendar cal = null;
		RequestDispatcher rd = null;
		int hour = 0;
		if (!request.getServletPath().equals("/home.htm")) {
			// get calender instance
			cal = Calendar.getInstance();
			// get current hour
			hour = cal.get(Calendar.HOUR_OF_DAY);
			if (hour < 5 || hour > 17) {
				rd = request.getRequestDispatcher("timeout.jsp");
				rd.forward(request, response);
				return false;
			} else {
				return true;
			}
		} else
			return true;
	}
}
