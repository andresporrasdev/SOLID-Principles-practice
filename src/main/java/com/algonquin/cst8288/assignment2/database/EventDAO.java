/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.algonquin.cst8288.assignment2.database;

import com.algonquin.cst8288.assignment2.DataAccess.EventDTO;
import java.sql.SQLException;

/**
 *
 * @author camil
 */
public interface EventDAO {
    void createEvent(EventDTO event) throws SQLException;
    void deleteEvent(EventDTO event) throws SQLException;
    void updateEvent(EventDTO event) throws SQLException;
}
