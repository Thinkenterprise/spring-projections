package de.msg.xt.route;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

// Projection für Default-Ansicht
// @RepositoryRestResource(excerptProjection = ConnectionProjection.class)
public interface RouteRepository extends CrudRepository<Route, Long> {
	
	@EntityGraph("routeFlightAircraft")
	public Iterable<Route> findAll();

}
