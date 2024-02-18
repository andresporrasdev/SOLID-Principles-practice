/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment2.library;

import com.algonquin.cst8288.assignment2.event.Event;
import com.algonquin.cst8288.assignment2.event.EventType;

/**
 *
 * @author camil
 */
public abstract class LibraryFactory  {
    public abstract Event createEvent(EventType eventType, String eventName, String eventDescription, String eventActivity, double admissionFee);
}
