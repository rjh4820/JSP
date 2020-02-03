package com.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/tempFilter")
public class TempFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("filer init()");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("filer doFilter()");

		request.setCharacterEncoding("UTF-8");

		//reqeust Filter
		
		chain.doFilter(request, response);
		
		//response Filter
	}

	public void destroy() {
		System.out.println("filer destroy()");	
	}

}
