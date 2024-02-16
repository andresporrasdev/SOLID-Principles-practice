/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment2.event;

/**
 *
 * @author camil
 */
public class MovieNightEvent extends Event{
    public MovieNightEvent(){
        
    }

    public  MovieNightEvent(String eventName, String eventDescription, String eventActivities, double admisionFee){
        super(eventName, eventDescription, eventActivities, admisionFee );
        
    }
    
    @Override
    public void calculateAdmissionFee() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
