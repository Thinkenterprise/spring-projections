package de.msg.xt.route.projection;

import java.time.DayOfWeek;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import de.msg.xt.aircraft.projection.AircraftProjection;
import de.msg.xt.route.Route;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

@Projection(name = "flightplan", types = Route.class)
public interface FlightplanProjection extends ConnectionProjection {

	Set<DayOfWeek> getScheduledWeekdays();
	
	@Value("#{@routeService.formatTime(target.arrivalTime)}")
	String getArrivalTime();

	AircraftProjection getAircraft() ;
}
