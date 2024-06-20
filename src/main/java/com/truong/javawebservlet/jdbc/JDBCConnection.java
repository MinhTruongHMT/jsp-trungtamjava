package com.truong.javawebservlet.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static Connection getConnection() {
        final String url = "jdbc:mysql://localhost:3306/ecommerce";
        final String user = "root";
        final String password = "123456";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Connection con = getConnection();
        System.out.println(con);
    }
}
