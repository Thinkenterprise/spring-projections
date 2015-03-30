package de.msg.xt.aircraft;

import org.springframework.data.repository.CrudRepository;

import com.google.common.base.Optional;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

public interface AircraftRepository extends CrudRepository<Aircraft, Long>{

	Aircraft findByRegistration(String registration);

}
