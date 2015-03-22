package de.msg.xt.route.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import de.msg.xt.route.Route;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

public class RouteRepositoryImpl implements RouteRepositoryJpa {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Route> findAllJpa() {
		
		TypedQuery<Route> query = entityManager.createQuery("select r from Route r", Route.class);
		return query.getResultList();
	}

}
