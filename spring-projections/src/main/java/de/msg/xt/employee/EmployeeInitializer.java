package de.msg.xt.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.msg.xt.aircraft.Aircraft;
import de.msg.xt.employee.repository.EmployeeRepository;

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
		
		Pilot pilot = new Pilot("P656747", "Franz", "Flieger");
		pilot.setCertificateNumber("RF775566734");
		pilot.setAllowedAircrafts(new Aircraft.Type[]{Aircraft.Type.A380});
		employeeRepository.save(pilot);

		CabinAttendant attendant1 = new CabinAttendant("P234234", "Herbert", "Haser");
		attendant1.setRank(CabinAttendant.Rank.Purser);
		employeeRepository.save(attendant1);

	}
}
