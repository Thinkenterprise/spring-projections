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
	
	private String type;
	
	private String registration;
	
	public Aircraft() {
		super();
	}

	public Aircraft(String type, String registration) {
		super();
		this.type = type;
		this.registration = registration;
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
