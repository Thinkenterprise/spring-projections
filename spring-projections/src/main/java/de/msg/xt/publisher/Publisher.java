package de.msg.xt.publisher;

import javax.persistence.Entity;

import de.msg.xt.core.AbstractEntity;

/**  Spring Projections Samples 
**  Design and Development by msg Applied Technology Research
**  Copyright (c) 2014 msg systems ag (http://www.msg-systems.com/)
**  All Rights Reserved.
*/


/**
* 
* @author Michael Schäfer, Achim Müller 
* 
* */



@Entity
public class Publisher extends AbstractEntity {
	
	private String name;

	public Publisher(String name) {
		super();
		this.name = name;
	}

	public Publisher() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
