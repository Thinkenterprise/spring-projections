package de.msg.xt.route;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import de.msg.xt.route.projection.FlightplanProjection;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

// Projection für Default-Ansicht
// @RepositoryRestResource(excerptProjection = FlightplanProjection.class)
public interface RouteRepository extends CrudRepository<Route, Long> {
	
	//@EntityGraph("routeFlightAircraft")
	@Query("select r from Route r where r.destination = :destination")
	public Iterable<Route> findByDestination(@Param("destination") String destination);
}
