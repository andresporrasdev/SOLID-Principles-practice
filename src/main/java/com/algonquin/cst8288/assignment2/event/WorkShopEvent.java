/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment2.event;

import static com.algonquin.cst8288.assignment2.constants.Constants.*;
import com.algonquin.cst8288.assignment2.event.Event;

/**
 *
 * @author camil
 */
public class WorkShopEvent extends Event {

    public WorkShopEvent() {
    }

    public  WorkShopEvent(String eventName, String eventDescription, String eventActivities, double admisionFee){
        super(eventName, eventDescription, eventActivities, admisionFee );
        
    }

    @Override
    public void calculateAdmissionFee() {
        double fee = WORKSHOP_DURATION * WORKSHOP_RATE ;

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
