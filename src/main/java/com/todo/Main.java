package com.todo;

import java.sql.Connection;
import java.sql.SQLException;

import com.todo.util.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        try (Connection cn = db.getDBConnection()) {
            System.out.println("Database connection established successfully.");
        } catch (SQLException e) {
            System.err.println("Failed to establish database connection.");
            e.printStackTrace();  // prints full cause & line numbers — useful for debugging
        } catch (Exception e) {
            System.err.println("Unexpected error:");
            e.printStackTrace();
        }
    }
}
