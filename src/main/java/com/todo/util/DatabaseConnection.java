package com.todo.util;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException;

public class DatabaseConnection {
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp";
    public static final String USER = "root";
    public static final String PASSWORD = "9677534585";

    static {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
    }
        catch(ClassNotFoundException e){
            System.out.println("MySQL JDBC Driver not found.");
        }
    }
    public Connection getDBConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}

