package de.msg.xt.route;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.msg.xt.route.repository.RouteRepository;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

@Service
public class RouteInitializer {

	
	private RouteRepository routeRepository;

	@Autowired
	public RouteInitializer(RouteRepository routeRepository) {
		super();
		this.routeRepository = routeRepository;
		
		
		Route route = new Route("LH444", "Koeln", "Muenchen");
		
		Flight flight = new Flight(120.45, Calendar.getInstance().getTime() );
		route.addFlight(flight);
		
		flight = new Flight(111.45, Calendar.getInstance().getTime() );
		route.addFlight(flight);
		
		routeRepository.save(route);
	}
	
	
	
}
