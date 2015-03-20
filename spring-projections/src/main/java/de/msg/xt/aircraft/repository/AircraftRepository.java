package de.msg.xt.aircraft.repository;

import org.springframework.data.repository.CrudRepository;

import de.msg.xt.aircraft.Aircraft;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

public interface AircraftRepository extends CrudRepository<Aircraft, String>{

}
