package com.truong.javawebservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FormtServlet", value = "/form")
public class Form extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>GetRequestServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form action=\"/get-request\" method=\"post\">\n" +
                "    <input type=\"text\" name=\"userName\">\n" +
                "    <input type=\"submit\" value=\"submit\">\n" +
                "</form>");

        out.println("</body>");
        out.println("</body>");
        out.println("</html>");
    }
}
