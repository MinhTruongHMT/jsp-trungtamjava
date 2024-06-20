package com.truong.javawebservlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "setCookieServlet", value = "/setCookie")

public class CookieServlet extends HelloServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        Cookie  cookie = new Cookie("cookie", "cookievalue");
        cookie.setMaxAge(5);
        response.addCookie(cookie);
    }
}
