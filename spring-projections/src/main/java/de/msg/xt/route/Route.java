package de.msg.xt.route;

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

	String number;
	String destination;
	String departure;
	
	@Transient
	Double total;
	

	public Route() {
		super();
	}

	public Route(String number) {
		super();
		this.number = number;
	}
		
	public Route(String number, String destination, String departure) {
		super();
		this.number = number;
		this.destination = destination;
		this.departure = departure;
	}

	@OneToMany(cascade=CascadeType.ALL)
	private Set<Flight> flights = new HashSet<Flight>();

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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
	
}
