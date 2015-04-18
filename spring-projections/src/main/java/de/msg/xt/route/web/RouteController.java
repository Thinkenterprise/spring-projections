package de.msg.xt.route.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.projection.ProjectionFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.msg.xt.route.Route;
import de.msg.xt.route.RouteRepository;
import de.msg.xt.route.projection.ConnectionProjection;

@RestController
@RequestMapping("/mvc/routes")
public class RouteController {

	@Autowired
	private RouteRepository routeRepository;
	
	private ProjectionFactory projectionFactory;
	
	@Autowired
	public RouteController(ProjectionFactory projectionFactory) {
		this.projectionFactory=projectionFactory;
	}
	
	
	@RequestMapping
	public ResponseEntity<ConnectionProjection> getAll() {
			
		Iterable<Route> routes = routeRepository.findAll();
		
		ConnectionProjection connectionProjection = projectionFactory.createProjection(ConnectionProjection.class, routes);
		return new ResponseEntity<ConnectionProjection>(connectionProjection,HttpStatus.OK);
				
		
	}
	
	
	
	
}
