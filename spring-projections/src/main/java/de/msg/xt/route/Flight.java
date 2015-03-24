package de.msg.xt.route;

import java.util.Date;

import javax.persistence.Entity;

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
public class Flight extends AbstractEntity {

	
	private double price;
	private Date time;
	
	public Flight() {
		super();
	}
	
	public Flight(double price, Date time) {
		super();
		this.price = price;
		this.time = time;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
}
