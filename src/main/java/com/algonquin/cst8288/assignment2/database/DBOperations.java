package com.algonquin.cst8288.assignment2.database;

import com.algonquin.cst8288.assignment2.DataAccess.EventDTO;
import com.algonquin.cst8288.assignment2.event.Event;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBOperations {

    public static void createEvent(EventDTO event) {
        try (Connection con = DBConnection.getInstance()) {
        String insertQuery = "INSERT INTO events (event_name, event_description, event_activities, admission_fees) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(insertQuery)) {
            pstmt.setString(1, event.getEventName());
            pstmt.setString(2, event.getEventDescription());
            pstmt.setString(3, event.getEventActivities());
            pstmt.setDouble(4, event.getAdmissionFees());
            pstmt.executeUpdate();
            System.out.println("Event created successfully");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }
        
//        public static void retrieveEvent(int event_id) {}
    public static Event retrieveEvent(int eventId) {
        Event event = null;
        try (Connection con = DBConnection.getInstance()) {
            String retrieveQuery = "SELECT * FROM events WHERE event_id = ?";
            try (PreparedStatement pstmt = con.prepareStatement(retrieveQuery)) {
                pstmt.setInt(1, eventId);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        String eventName = rs.getString("event_name");
                        String eventDescription = rs.getString("event_description");
                        String eventActivities = rs.getString("event_activities");
                        double admissionFees = rs.getDouble("admission_fees");
                        event = new Event(eventName, eventDescription, eventActivities, admissionFees) {
                            @Override
                            public void calculateAdmissionFee() {
                                throw new UnsupportedOperationException("AdmissionFee in DBOperations."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                            }
                        };
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return event;
    }

//    public static void updateEvent(Event event) {}
    public static void updateEvent(Event event) {
        try (Connection con = DBConnection.getInstance()) {
            String updateQuery = "UPDATE events SET event_name = ?, event_description = ?, event_activities = ?, admission_fees = ? WHERE event_id = ?";
            try (PreparedStatement pstmt = con.prepareStatement(updateQuery)) {
                pstmt.setString(1, event.getEventName());
                pstmt.setString(2, event.getEventDescription());
                pstmt.setString(3, event.getEventActivities());
                pstmt.setDouble(4, event.getAdmissionFees());
                pstmt.executeUpdate();
                System.out.println("Event updated successfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public static void deleteEvent(int event_id) {}
    public static void deleteEvent(int eventId) {
        try (Connection con = DBConnection.getInstance()) {
            String deleteQuery = "DELETE FROM events WHERE event_id = ?";
            try (PreparedStatement pstmt = con.prepareStatement(deleteQuery)) {
                pstmt.setInt(1, eventId);
                pstmt.executeUpdate();
                System.out.println("Event deleted successfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
