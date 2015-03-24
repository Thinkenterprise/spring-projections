package de.msg.xt.aircraft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

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

	AircraftRepository aircraftRepository;
	
	@Autowired
	public AircraftInitializer(AircraftRepository aircraftRepository) {
	
		Assert.notNull(aircraftRepository, "PlaneRepository must not be null!");
				
		if(aircraftRepository.count()!=0)
			return;
			
		aircraftRepository.save(new Aircraft(1, "A319", "D-AILA"));
		aircraftRepository.save(new Aircraft(2, "A320", "D-AIPA"));
		aircraftRepository.save(new Aircraft(3, "A380", "D-AIMA"));
	}
	
}
