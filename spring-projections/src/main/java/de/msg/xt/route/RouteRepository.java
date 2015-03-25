package de.msg.xt.route;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

//@RepositoryRestResource(excerptProjection = RouteConnectionExcerpt.class)
public interface RouteRepository extends CrudRepository<Route, Long> {	
}
