/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment2.DataAccess;

/**
 *
 * @author camil
 */
public class EventDTO {
    
    protected Integer eventId;
    protected String eventName;
    protected String eventDescription;
    protected String eventActivities;
    protected double admissionFees;
    
    public Integer getEventId(){
    return eventId;
    }
    
    public void setEventId(Integer eventId ){
        this.eventId= eventId;
    }
    
    public String getEventName(){
        return eventName;
    }
    
    public void setEventName(String eventName){
        this.eventName=eventName;
    }
    
        public String getEventDescription(){
        return eventDescription;
    }
    
    public void setEventDescription(String eventDescription){
        this.eventDescription=eventDescription;
    }
    
    public String getEventActivities(){
        return eventActivities;
    }
    
    public void setEventActivities(String eventActivities ){
        this.eventActivities=eventActivities;
    }
    
    public double getAdmissionFeeds(){
        return admissionFees;
    }
    
    public void setAdmissionFees(double admissionFees){
        this.admissionFees=admissionFees;
    }
            
          
}
