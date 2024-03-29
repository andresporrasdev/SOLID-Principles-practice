package com.algonquin.cst8288.assignment2.event;

import com.algonquin.cst8288.assignment2.DataAccess.EventDTO;

public abstract class Event {
    
	
    protected String eventName;
    protected String eventDescription;
    protected String eventActivities;
    protected double admissionFees;
    
    
    
    public Event() {

    }
    
    public Event(String eventName, String eventDescription, String eventActivities, double admissionFees){
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventActivities = eventActivities;
        this.admissionFees = admissionFees;
        
        //Storing item to DTO
        EventDTO eventDTO = new EventDTO();
        eventDTO.setEventName(eventName);
        eventDTO.setEventDescription(eventDescription);
        eventDTO.setEventActivities(eventActivities);
        eventDTO.setAdmissionFees(admissionFees); // Set admission fees
       
        
    }
    
 
	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}





	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}





	/**
	 * @return the eventDescription
	 */
	public String getEventDescription() {
		return eventDescription;
	}





	/**
	 * @param eventDescription the eventDescription to set
	 */
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}





	/**
	 * @return the eventActivities
	 */
	public String getEventActivities() {
		return eventActivities;
	}





	/**
	 * @param eventActivities the eventActivities to set
	 */
	public void setEventActivities(String eventActivities) {
		this.eventActivities = eventActivities;
	}



	/**
	 * @return the admissionFees
	 */
	public double getAdmissionFees() {
		return admissionFees;
	}


	/**
	 * @param admissionFees the admissionFees to set
	 */
	public void setAdmissionFees(double admissionFees) {
		this.admissionFees = admissionFees;
	}


	// Every library as it own admission fee
	public abstract void calculateAdmissionFee();
    
    
}
