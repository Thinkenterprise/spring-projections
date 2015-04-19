package de.msg.xt.route.projection;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import de.msg.xt.employee.projection.EmployeeProjection;
import de.msg.xt.route.Flight;
import de.msg.xt.route.Route;

/**
 * Spring Projections Samples Design and Development by msg Applied Technology
 * Research Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/) All
 * Rights Reserved.
 * 
 * @author Michael Schäfer, Achim Müller
 */

@Projection(name = "crew", types = Route.class)
public interface CrewProjection extends ConnectionProjection {

	List<FlightProjection> getFlights() ;
	
}

