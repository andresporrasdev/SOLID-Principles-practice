/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment2.DataAccess;

import com.algonquin.cst8288.assignment2.database.DBConnection;
import com.algonquin.cst8288.assignment2.database.EventDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camil
 */
public class EventDAOImpl implements EventDAO{

    @Override
    public void createEvent(EventDTO event) throws SQLException{
        ResultSet rs = null;
        // Establishing connection
        Connection con = DBConnection.establishConnection();

        // Testing SQL
        String insertQuery = "INSERT INTO events (event_name, event_description, event_activities, admission_fees) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(insertQuery);
        pstmt.setString(1, event.eventName);
        pstmt.setString(2, event.eventDescription);
        pstmt.setString(3, event.eventActivities);
        pstmt.setDouble(4, 23.00);
        pstmt.executeUpdate();

        // Closing resources
        pstmt.close();
        con.close();
    }

    @Override
    public void deleteEvent(EventDTO event) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateEvent(EventDTO event) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
