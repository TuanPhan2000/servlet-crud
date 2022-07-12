package com.example.servletcrud.dbutil;

import java.sql.DriverManager;

public class Connection {

    private static String DB_URL = "jdbc:mysql://localhost:3306/demo";
    private static String USER_NAME = "root";
    private static String PASSWORD = "admin";

    public static java.sql.Connection getConnection() {
        java.sql.Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn =  DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }

}
