package de.msg.xt.aircraft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import de.msg.xt.aircraft.repository.AircraftRepository;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

@Service
public class AircraftInitializer {

	@Autowired
	public AircraftInitializer(AircraftRepository planeRepository) {
	
		Assert.notNull(planeRepository, "PlaneRepository must not be null!");
				
		if(planeRepository.count()!=0)
			return;
			
		planeRepository.save(new Aircraft(1, Aircraft.Type.A319, "D-AILA"));
		planeRepository.save(new Aircraft(2, Aircraft.Type.A320, "D-AIPA"));
		planeRepository.save(new Aircraft(3, Aircraft.Type.A380, "D-AIMA"));
	}
	
}
