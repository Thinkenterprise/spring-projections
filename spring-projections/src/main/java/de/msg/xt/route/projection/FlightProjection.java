package de.msg.xt.route.projection;

import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import de.msg.xt.employee.projection.EmployeeProjection;
import de.msg.xt.route.Flight;

@Projection(name="flightEmployee", types = Flight.class)
public interface FlightProjection {

	
		@Value("#{target.date.toString()}")
		String getDate();

		Set<EmployeeProjection> getEmployees() ;

		
		
}
