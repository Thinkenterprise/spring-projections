package de.msg.xt.aircraft;

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
public class Aircraft extends AbstractEntity {
	
	public static enum Type {
		A300, A310, A318, A319, A320, A380, B747, B787
	}

	private long serial;
	private Type type;
	private String registration;

	public Aircraft() {
		super();
	}

	public Aircraft(Long serial) {
		super();
		this.serial = serial;
	}

	public Aircraft(long serial, Type type, String registration) {
		super();
		this.serial = serial;
		this.type = type;
		this.registration = registration;
	}

	public Long getSerial() {
		return serial;
	}

	public void setSerial(Long serial) {
		this.serial = serial;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

}
