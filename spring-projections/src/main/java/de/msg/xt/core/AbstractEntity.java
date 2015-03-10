package de.msg.xt.core;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

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


@MappedSuperclass
public class AbstractEntity {
	
	@Id
	@GeneratedValue
	private Long id;
}

