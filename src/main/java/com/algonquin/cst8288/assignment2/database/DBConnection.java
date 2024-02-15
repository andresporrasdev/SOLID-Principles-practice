package com.algonquin.cst8288.assignment2.database;

import java.sql.Connection;

public class DBConnection {
	
	private static Connection connection = null;
	
	private String serverUrl = "jdbc:mysql://localhost:3306/bookvault";
	private String userString = "root";
	private String passwordString = "AlgoFacil123#";
	private String driverString = "com.mysql.cj.jdbc.Driver";
	
}
