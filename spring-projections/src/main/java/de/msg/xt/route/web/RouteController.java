package de.msg.xt.route.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.projection.ProjectionFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.msg.xt.route.Route;
import de.msg.xt.route.RouteRepository;
import de.msg.xt.route.projection.ConnectionProjection;
import de.msg.xt.route.projection.CrewProjection;
import de.msg.xt.route.projection.FlightplanProjection;


@RestController
@RequestMapping("/mvc/routes")
public class RouteController {

	@Autowired
	private RouteRepository routeRepository;
	
	@Autowired
	private ProjectionFactory projectionFactory;
		
		
	@RequestMapping("{id}/connection")
	public ResponseEntity<ConnectionProjection> getConnection(@PathVariable(value="id") Long id) {
			
		Route routes = routeRepository.findOne( new Long(id));
		
		ConnectionProjection connectionProjection = projectionFactory.createProjection(ConnectionProjection.class, routes);
		return new ResponseEntity<ConnectionProjection>(connectionProjection,HttpStatus.OK);
		
	}
	
	
	@RequestMapping("{id}/flightplan")
	public ResponseEntity<FlightplanProjection> getFlightplan(@PathVariable(value="id") Long id) {
			
		Route routes = routeRepository.findOne( new Long(id));
		
		FlightplanProjection flightplanProjection = projectionFactory.createProjection(FlightplanProjection.class, routes);
		return new ResponseEntity<FlightplanProjection>(flightplanProjection,HttpStatus.OK);
		
	}
	
	
	@RequestMapping("{id}/crew")
	public ResponseEntity<CrewProjection> getCrew(@PathVariable(value="id") Long id) {
			
		Route routes = routeRepository.findOne( new Long(id));
		
		CrewProjection crewProjection = projectionFactory.createProjection(CrewProjection.class, routes);
		return new ResponseEntity<CrewProjection>(crewProjection,HttpStatus.OK);
		
	}
	
	
	
	
}
