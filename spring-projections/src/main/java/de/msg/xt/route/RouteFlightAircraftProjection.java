package de.msg.xt.route;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import de.msg.xt.aircraft.Aircraft;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

@Projection(name = "routeFlightAircraft", types = Route.class)
public interface RouteFlightAircraftProjection {

	String getFlightNumber();

	String getDeparture();
	
	String getDestination();

	@Value("#{target.time.toString()}")
	String getTime();
	
	List<FlightProjection> getFlights() ;
	
	@Projection(types = Flight.class)
	public interface FlightProjection {
		
		@Value("#{target.date.toString()}")
		String getDate();

		AircraftProjection getAircraft() ;

		@Projection(types = Aircraft.class)
		public interface AircraftProjection {
			
			String getType();
		}
	}
}
