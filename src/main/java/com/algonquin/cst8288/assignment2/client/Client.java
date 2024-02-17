package com.algonquin.cst8288.assignment2.client;
import com.algonquin.cst8288.assignment2.DataAccess.EventDAOImpl;
import com.algonquin.cst8288.assignment2.DataAccess.EventDTO;
import com.algonquin.cst8288.assignment2.database.DBConnection;
import com.algonquin.cst8288.assignment2.library.AcademicLibrary;
import com.algonquin.cst8288.assignment2.library.LibraryFactory;
import com.algonquin.cst8288.assignment2.logger.LMSLogger;
import com.algonquin.cst8288.assignment2.logger.LogLevel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Client {
    public Client() {
}
	  
    

    public static void main(String[] args) throws SQLException {
        // Set log level to INFO
        LMSLogger logger = LMSLogger.getInstance();
        logger.setLogLevel(LogLevel.INFO);
        
        EventDTO eventDTO = new EventDTO();

        // Test WorkShop
        LibraryFactory academicLibrary = new AcademicLibrary();
        eventDTO.setEventName("Workshop");
        eventDTO.setEventDescription("Workshop Description Test");
        eventDTO.setEventActivities("Workshop Activities Test");
        eventDTO.setAdmissionFees(20.0); // Set admission fees
        
        // Store the event in the database
        try {
            EventDAOImpl eventDAO = new EventDAOImpl();
            eventDAO.createEvent(eventDTO);
            logger.log(LogLevel.INFO, "Event created and stored successfully in the database.");
        } catch (SQLException e) {
            logger.logException(LogLevel.ERROR, "Failed to store the event in the database.", e);
        }
        
        //Test BookLunch
//      LibraryFactory libraryFactory = new AcademicLibrary();
        eventDTO.setEventName("Booklunch");
        eventDTO.setEventDescription("BookLunch Description Test");
        eventDTO.setEventActivities("Activities BookLunch");
        eventDTO.setAdmissionFees(20.0); // Set admission fees
        
        // Store the event in the database
        try {
            EventDAOImpl eventDAO = new EventDAOImpl();
            eventDAO.createEvent(eventDTO);
            logger.log(LogLevel.INFO, "Event created and stored successfully in the database.");
        } catch (SQLException e) {
            logger.logException(LogLevel.ERROR, "Failed to store the event in the database.", e);
        }
        
    } 
    
}
