package de.msg.xt.employee.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import de.msg.xt.employee.CabinAttendant;
import de.msg.xt.employee.Employee;
import de.msg.xt.employee.Pilot;
import de.msg.xt.employee.Role;

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

	@Value("#{target.firstName} #{target.lastName}")
	String getName();
		
	Role getRole();
	
//  Doesn't work!!	
//	@Value("#{target.role.certificateNumber}")
//	String getCertificateNumber();
//
//
//	@Projection(types = { Role.class, CabinAttendant.class, Pilot.class})
//	public interface RoleProjection {
//		
//		String getCertificateNumber();
//	}
}
