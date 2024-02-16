package com.algonquin.cst8288.assignment2.client;
import com.algonquin.cst8288.assignment2.DataAccess.EventDAOImpl;
import com.algonquin.cst8288.assignment2.database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Client {
	
//    public static void main(String[] args) throws SQLException {
//        //Singleton
//        DBConnection.stablishConnection();
//        DBConnection.stablishConnection();
//// Testing SQL
//        String insertQuery = "INSERT INTO events (event_name, event_description, event_activities, admission_fees) VALUES (?, ?, ?, ?)";
//        PreparedStatement pstmt = DBConnection.connection.prepareStatement(insertQuery);
//        pstmt.setString(1, "Author Talk");
//        pstmt.setString(2, "An intimate discussion with renowned authors");
//        pstmt.setString(3, "book fair");
//        pstmt.setDouble(4, 123.0);
//        pstmt.executeUpdate();
//    }
    
    

    public static void main(String[] args) throws SQLException {
        // Establishing connection
        Connection con = DBConnection.establishConnection();

        // Testing SQL
        String insertQuery = "INSERT INTO events (event_name, event_description, event_activities, admission_fees) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(insertQuery);
        pstmt.setString(1, "Author Talk");
        pstmt.setString(2, "An intimate discussion with renowned authors");
        pstmt.setString(3, "book fair");
        pstmt.setDouble(4, 10.00);
        pstmt.executeUpdate();

        // Closing resources
        pstmt.close();
        con.close();
    }
    
}
