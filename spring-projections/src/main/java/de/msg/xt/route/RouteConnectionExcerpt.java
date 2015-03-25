package de.msg.xt.route;

import org.springframework.data.rest.core.config.Projection;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

@Projection(name = "connectionExcerpt", types = Route.class)
public interface RouteConnectionExcerpt {

	String getDeparture();
	
	String getDestination();
}