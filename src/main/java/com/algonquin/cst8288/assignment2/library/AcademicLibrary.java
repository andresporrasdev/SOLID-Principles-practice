/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment2.library;

import com.algonquin.cst8288.assignment2.event.BookLunchEvent;
import com.algonquin.cst8288.assignment2.event.WorkShopEvent;
import com.algonquin.cst8288.assignment2.event.Event;
import com.algonquin.cst8288.assignment2.event.EventType;
import static com.algonquin.cst8288.assignment2.event.EventType.KIDS_STORY;
import static com.algonquin.cst8288.assignment2.event.EventType.MOVIE_NIGHT;
import com.algonquin.cst8288.assignment2.event.KidsStoryEvent;
import com.algonquin.cst8288.assignment2.event.MovieNightEvent;

/**
 *
 * @author camil
 */
public class AcademicLibrary extends LibraryFactory{
        public Event createEvent(EventType eventType) {
        switch (eventType){
            case WORKSHOP: return new WorkShopEvent();
            case BOOKLUNCH: return new BookLunchEvent();
            default: throw new IllegalArgumentException("Invalid event type "+eventType);
        }
    }
}
