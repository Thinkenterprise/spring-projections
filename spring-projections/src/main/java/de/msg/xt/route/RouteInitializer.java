package de.msg.xt.route;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		route.addPlannedWeekday(DayOfWeek.MONDAY);
		route.addPlannedWeekday(DayOfWeek.FRIDAY);
		route.setTime(LocalTime.of(8, 0));
		
		Flight flight = new Flight(120.45, LocalDate.of(2015, 9, 23) );
		route.addFlight(flight);
		
		flight = new Flight(111.45, LocalDate.of(2015, 9, 24) );
		route.addFlight(flight);
		
		routeRepository.save(route);
	}
	
	
	
}
