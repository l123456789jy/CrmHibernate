package com.crm.web.web.filter;


import com.crm.web.web.util.HibernateUtil;
import org.hibernate.Session;

import javax.servlet.*;
import java.io.IOException;


public class HibernateSessionFilter implements Filter {
	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		chain.doFilter(request, response);
		Session session = HibernateUtil.getCurrentSession();
		session.close();
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

}

