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

public interface FlightRepository extends CrudRepository<Flight, Long> {

	@Query("select f from Flight f where f.date = :date")
	public Iterable<Flight> findByDate(
			@DateTimeFormat(iso = ISO.DATE) @Param("date") LocalDate date);

}
