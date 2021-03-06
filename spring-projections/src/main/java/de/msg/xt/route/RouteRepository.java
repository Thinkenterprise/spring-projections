package de.msg.xt.route;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 * Spring Projections Samples Design and Development by msg Applied Technology
 * Research Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/) All
 * Rights Reserved.
 * 
 * @author Michael Schäfer, Achim Müller
 */

// Projection für Default-Ansicht
// @RepositoryRestResource(excerptProjection = ConnectionProjection.class)
public interface RouteRepository extends CrudRepository<Route, Long> {

	@Query("select r from Route r where r.departure = :departure")
	public Iterable<Route> findByDeparture(@Param("departure") String departure);
}
