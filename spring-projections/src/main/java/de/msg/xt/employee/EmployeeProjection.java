package de.msg.xt.employee;

import org.springframework.data.rest.core.config.Projection;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

@Projection(name = "employeeCertificate", types = Employee.class)
public interface EmployeeProjection {

	Long getId();

	RoleProjection getRole();

	@Projection(types = Role.class)
	public interface RoleProjection {
		
		String getCertificateNumber();
	}
}
