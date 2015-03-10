package de.msg.xt.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**  Spring Projections Samples 
**  Design and Development by msg Applied Technology Research
**  Copyright (c) 2014 msg systems ag (http://www.msg-systems.com/)
**  All Rights Reserved.
*/


/**
* 
* @author Michael Schäfer, Achim Müller 
* 
* */

@Service
public class PublisherInitializer {

	
	@Autowired
	public PublisherInitializer(PublisherRepository publisherRepository) {
	
		Assert.notNull(publisherRepository, "PublisherRepository must not be null!");
				
		if(publisherRepository.count()!=0)
			return;
			
		publisherRepository.save(new Publisher("entwickler.press"));
		
		
	}
	
	
}
