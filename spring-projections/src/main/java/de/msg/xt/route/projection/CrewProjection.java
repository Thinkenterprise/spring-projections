package de.msg.xt.route.projection;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import de.msg.xt.employee.Employee;
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
public interface CrewProjection {

	String getFlightNumber();

	@Value("#{target.departureTime.toString()}")
	String getDepartureTime();

	List<FlightProjection> getFlights() ;
	
	@Projection(types = Flight.class)
	public interface FlightProjection {
		
		@Value("#{target.date.toString()}")
		String getDate();

		Set<EmployeeProjection> getEmployees() ;

		@Projection(types = Employee.class)
		public interface EmployeeProjection {
			
			String getFirstName();

			String getLastName();

			@Value("#{target.role.toString()}")
			String getRole();
		}
	}
}

