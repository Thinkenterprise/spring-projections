package de.msg.xt.route.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import de.msg.xt.route.Route;

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

	String getFlightNumber();

	String getDeparture();
	
	String getDestination();
	
	@Value("#{target.departureTime.toString()}")
	String getDepartureTime();
}
