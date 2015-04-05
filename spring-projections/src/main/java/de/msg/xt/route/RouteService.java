package de.msg.xt.route;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

@Service("routeService")
public class RouteService {

	public int calculateFlightCount(Route route) {
		return route.getFlights().size();
	}

	public String formatTime(LocalTime time) {
		return time.toString();
	}
}
