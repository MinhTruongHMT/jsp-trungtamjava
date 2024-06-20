package com.truong.javawebservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetRequestServlet", value = "/get-request")
public class GetRequestDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>GetRequestServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>GetRequestServlet</h1>");
        String parameter = req.getParameter("userName");
        out.println("<h1>" + parameter + "</h1>");
        out.println("</body>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>GetRequestServlet</title>");
        out.println("</head>");
        out.println("<body>");
        String parameter = req.getParameter("userName");
        out.println("<h1>" + parameter + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
