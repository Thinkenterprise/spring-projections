package de.msg.xt.route;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

@Projection(name = "connection", types = Route.class)
public interface ConnectionProjection {

	String getDeparture();
	
	String getDestination();
}
