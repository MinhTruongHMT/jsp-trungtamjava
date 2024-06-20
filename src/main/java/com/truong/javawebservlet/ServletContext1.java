package com.truong.javawebservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/thongtin")
public class ServletContext1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String username =(String) getServletContext().getAttribute("user");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>ServletContext</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>"+username+"</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
