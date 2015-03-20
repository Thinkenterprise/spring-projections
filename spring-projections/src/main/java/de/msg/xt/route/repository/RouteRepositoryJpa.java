package de.msg.xt.route.repository;

import java.util.List;

import de.msg.xt.route.Route;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

public interface RouteRepositoryJpa {

	public List<Route> findAllJpa();
	
}
