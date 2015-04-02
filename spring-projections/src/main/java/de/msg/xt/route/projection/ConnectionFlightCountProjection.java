package de.msg.xt.route.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.EntityGraph;
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

@Projection(name = "connectionFlightCount", types = Route.class)
public interface ConnectionFlightCountProjection {

	String getDeparture();
	
	String getDestination();
	
	@Value("#{@routeService.calculateFlightCount(target)}")	
	int getFlightCount();
}
