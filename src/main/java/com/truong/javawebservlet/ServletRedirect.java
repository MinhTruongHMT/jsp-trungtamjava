package com.truong.javawebservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "Redirect", value = "/redirect")
public class ServletRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.sendRedirect("http://youtube.com"); cách 1
        resp.setStatus(resp.SC_MOVED_TEMPORARILY);
        resp.setHeader("Location", "https://youtube.com");  // cách 2
    }
}
