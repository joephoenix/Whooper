package com.web.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class MyInterceptor extends HandlerInterceptorAdapter {
private int openingTime=22;
private int closingTime=22;
public void setOpeningTime(int openingTime) {
this.openingTime = openingTime;
}
public void setClosingTime(int closingTime) {
this.closingTime = closingTime;
}

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println(handler);
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		if (openingTime <= hour && hour < closingTime) {
			return true;
		} else {
		//	response.sendRedirect("http://sina.com.cn");
			return true;
		}
	}
}