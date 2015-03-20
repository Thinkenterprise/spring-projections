package de.msg.xt.route.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import de.msg.xt.route.Route;
import de.msg.xt.route.projection.RouteProjection;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/


@RepositoryRestResource(excerptProjection = RouteProjection.class)
public interface RouteRepository extends CrudRepository<Route, Long>, RouteRepositoryJpa {

	public Iterable<Route> findByDestination(@Param("destination") String destination);
	
	@Query("select r from Route r where r.destination = :destination")
	public Iterable<Route> findByDestinationWithQuery(@Param("destination") String destination); 
	
	@EntityGraph("routeFlight")
	public Page<Route> findAll(Pageable request);
	
}
