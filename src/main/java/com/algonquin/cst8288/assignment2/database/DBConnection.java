package com.algonquin.cst8288.assignment2.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	

    private static Connection connection = null;
    PreparedStatement prepStatement = null; // prepares query for execution
    ResultSet resultSet = null; // manages results
    private String serverUrl = "jdbc:mysql://localhost:3306/bookvault";
    private String userString = "root";
    private String passwordString = "AlgoFacil123#";
    private String driverString = "com.mysql.cj.jdbc.Driver";

    public void stablishConnection() throws SQLException{
        try {
        if (connection==null){
            connection = DriverManager.getConnection(serverUrl, userString, passwordString);
            System.out.println("Connection successful");
        } else System.out.println("Using existing connection");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

        
	

}
