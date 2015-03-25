package de.msg.xt.route;

import java.time.LocalTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import de.msg.xt.core.AbstractEntity;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

@Entity
@NamedEntityGraph(name="routeFlight", attributeNodes={@NamedAttributeNode("flights")}) 
public class Route extends AbstractEntity {

	String flightNumber;
	String departure;
	String destination;
	LocalTime time;
	
	String[] plannedWeekdays;
	
	@Transient
	Double total;
	

	public Route() {
		super();
	}

	public Route(String flightNumber) {
		super();
		this.flightNumber = flightNumber;
	}
		
	public Route(String flightNumber, String departure, String destination) {
		super();
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.departure = departure;
	}

	@OneToMany(cascade=CascadeType.ALL)
	private Set<Flight> flights = new HashSet<Flight>();

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String number) {
		this.flightNumber = number;
	}
	
	
	public void addFlight(Flight flight) {
		flights.add(flight);
	}

	public Set<Flight> getFlights() {
		return flights;
	}

	public void setFlights(Set<Flight> flights) {
		this.flights = flights;
	}
	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public String[] getPlannedWeekdays() {
		return plannedWeekdays;
	}

	public void setPlannedWeekdays(String[] plannedWeekdays) {
		this.plannedWeekdays = plannedWeekdays;
	}
	
}
