package com.truong.javawebservlet;

import com.truong.javawebservlet.jdbc.JDBCConnection;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {

        message = "Hello World!";
        System.out.println("SERVLET INIT");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       getServletContext().setAttribute("user", "Truong");
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
        Connection connection = JDBCConnection.getConnection();
       try{
           Statement statement = connection.createStatement();
           String sql = "select * from students";
           ResultSet resultSet = statement.executeQuery(sql);
           while (resultSet.next()) {
               String name = resultSet.getString("student_name");
               out.println(name);
           }
       }
       catch(Exception e){

       }
    }

    public void destroy() {
    }
}