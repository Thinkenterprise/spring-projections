package de.msg.xt.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

@Service
public class EmployeeInitializer {
	
	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeInitializer(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
		
		
		Employee employee = new Employee("P234238","Fred","Flieger");
		
		Pilot pilot = new Pilot("RF775566734",new String[]{"A380"});
		employee.setRole(pilot);
		
		employeeRepository.save(employee);
		
		
		employee = new Employee("P234234", "Tom", "Stewart");
		
		CabinAttendant cabinAttendant = new CabinAttendant(1);
		employee.setRole(cabinAttendant);
		
		employeeRepository.save(employee);
		
			
		
	}
}
