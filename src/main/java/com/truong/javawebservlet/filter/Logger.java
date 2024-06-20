package com.truong.javawebservlet.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;
import java.io.Writer;

@WebFilter(urlPatterns = {"/hello-servlet"},initParams = {
        @WebInitParam(name = "count",value = "100")
})
public class Logger implements Filter {
    private int count = 0;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("FILTER INIT");

        String c = filterConfig.getInitParameter("count");
        count = Integer.parseInt(c);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        count++ ;
        String value = request.getParameter("id");
        if(value != null) {
            response.setContentType("text/html");
            System.out.println(count);
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
