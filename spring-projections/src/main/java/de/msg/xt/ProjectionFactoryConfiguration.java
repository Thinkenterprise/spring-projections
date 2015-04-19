package de.msg.xt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.data.projection.ProjectionFactory;
import org.springframework.data.projection.SpelAwareProxyProjectionFactory;


@Configuration
public class ProjectionFactoryConfiguration {

	@Bean
	public ProjectionFactory getProjectionFactory() {
		
		return new SpelAwareProxyProjectionFactory(); 
		
	}
	
	
	
}
