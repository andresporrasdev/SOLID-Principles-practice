/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment2.library;

import com.algonquin.cst8288.assignment2.event.Event;
import com.algonquin.cst8288.assignment2.event.EventType;
import com.algonquin.cst8288.assignment2.event.KidsStoryEvent;
import com.algonquin.cst8288.assignment2.event.MovieNightEvent;

/**
 *
 * @author camil
 */
public class PublicLibrary extends LibraryFactory{

    @Override
    public Event createEvent(EventType eventType) {
        switch (eventType){
            case KIDS_STORY: return new KidsStoryEvent();
            case MOVIE_NIGHT: return new MovieNightEvent();
            default: throw new IllegalArgumentException("Invalid event type "+eventType);
        }
    }
    
}
