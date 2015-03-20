package de.msg.xt.route.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import de.msg.xt.route.Route;
import de.msg.xt.route.repository.RouteRepository;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/


//@RestController()
@RequestMapping(value="planes")
public class RouteResource {
	
	@Autowired
	private RouteRepository routeRepository;
	
	
	
	@RequestMapping(value="{id}")
	public ResponseEntity<Route> get(@PathVariable Long id) {
		return new ResponseEntity<Route>(routeRepository.findOne(id), HttpStatus.OK);
	}
	
	@RequestMapping
	public ResponseEntity<Iterable<Route>> getAll() {
		return new ResponseEntity<Iterable<Route>>(routeRepository.findAll(), HttpStatus.OK);
	}
	
}
