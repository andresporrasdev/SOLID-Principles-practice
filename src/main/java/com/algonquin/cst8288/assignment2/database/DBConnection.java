package com.algonquin.cst8288.assignment2.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	
    private static Connection connection = null;
    
    private DBConnection() { }

    private static final String serverUrl = "jdbc:mysql://localhost:3306/bookvault";
    private static final String userString = "root";
    private static final String passwordString = "AlgoFacil123#";
    private static final String driverString = "com.mysql.cj.jdbc.Driver";

    public static Connection establishConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                Class.forName(driverString);
                connection = DriverManager.getConnection(serverUrl, userString, passwordString);
                System.out.println("Connection successful");
            } catch (ClassNotFoundException | SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("Using existing connection");
        }
        return connection;
    }
    
    public static Connection getInstance() throws SQLException {
        if (connection == null || connection.isClosed()) {
            synchronized (DBConnection.class) {
                if (connection == null || connection.isClosed()) {
                    try {
                        Class.forName(driverString);
                        connection = DriverManager.getConnection(serverUrl, userString, passwordString);
                        System.out.println("Connection successful");
                    } catch (ClassNotFoundException | SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("Using existing connection");
        }
        return connection;
    }
    
        // Method to close the connection
    public static void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("Connection closed");
        }
    }
}
