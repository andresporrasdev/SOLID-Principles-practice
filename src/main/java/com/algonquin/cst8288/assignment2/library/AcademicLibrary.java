/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment2.library;

import com.algonquin.cst8288.assignment2.DataAccess.EventDAOImpl;
import com.algonquin.cst8288.assignment2.DataAccess.EventDTO;
import com.algonquin.cst8288.assignment2.database.EventDAO;
import com.algonquin.cst8288.assignment2.event.BookLunchEvent;
import com.algonquin.cst8288.assignment2.event.WorkShopEvent;
import com.algonquin.cst8288.assignment2.event.Event;
import com.algonquin.cst8288.assignment2.event.EventType;
import static com.algonquin.cst8288.assignment2.event.EventType.*;
import com.algonquin.cst8288.assignment2.event.KidsStoryEvent;
import com.algonquin.cst8288.assignment2.event.MovieNightEvent;
import com.algonquin.cst8288.assignment2.logger.LMSLogger;
import com.algonquin.cst8288.assignment2.logger.LogLevel;
import java.sql.SQLException;

/**
 *
 * @author camil
 */
public class AcademicLibrary extends LibraryFactory{

@Override
public Event createEvent(EventType eventType, String eventName, String eventDescription, String eventActivity, double admissionFee) {
    Event event = null;
    switch (eventType) {
        case WORKSHOP:
            event = new WorkShopEvent(eventName, eventDescription, eventActivity, admissionFee);
            break;
        case BOOKLUNCH:
            event = new BookLunchEvent(eventName, eventDescription, eventActivity, admissionFee);
            break;
        default:
            throw new IllegalArgumentException("Invalid event type " + eventType);
    }

    // Save the event to the database
    EventDAO eventDAO = new EventDAOImpl();
    EventDTO eventDTO = new EventDTO();
    eventDTO.setEventName(eventName);
    eventDTO.setEventDescription(eventDescription);
    eventDTO.setEventActivities(eventActivity);
    eventDTO.setAdmissionFees(admissionFee);
    
            // Set log level to INFO
        LMSLogger logger = LMSLogger.getInstance();
        logger.setLogLevel(LogLevel.INFO);
    try {
        eventDAO.createEvent(eventDTO);
        logger.log(LogLevel.INFO, "Event created and stored successfully in the database.");
        } catch (SQLException e) {
        // Handle exception
        logger.logException(LogLevel.ERROR, "Failed to store the event in the database.", e);
            }
    return event;
    } //end createEvent

}// end class
