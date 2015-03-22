package de.msg.xt.employee.repository;

import org.springframework.data.repository.CrudRepository;

import de.msg.xt.employee.Employee;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

public interface EmployeeRepository extends CrudRepository<Employee, String>{

}
