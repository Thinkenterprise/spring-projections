package de.msg.xt.aircraft;

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
public class Aircraft extends AbstractEntity {
	
	private long serial;
	
	private String type;
	
	private String registration;
	
	public Aircraft() {
		super();
	}

	public Aircraft(long serial) {
		super();
		this.serial = serial;
	}

	public Aircraft(long serial, String type, String registration) {
		super();
		this.serial = serial;
		this.type = type;
		this.registration = registration;
	}

	public long getSerial() {
		return serial;
	}

	public void setSerial(long serial) {
		this.serial = serial;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}
}
