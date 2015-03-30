package de.msg.xt;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import de.msg.xt.aircraft.Aircraft;
import de.msg.xt.aircraft.AircraftRepository;
import de.msg.xt.employee.CabinAttendant;
import de.msg.xt.employee.Employee;
import de.msg.xt.employee.EmployeeRepository;
import de.msg.xt.employee.Pilot;
import de.msg.xt.route.Flight;
import de.msg.xt.route.Route;
import de.msg.xt.route.RouteRepository;

/**
 * Spring Projections Samples Design and Development by msg Applied Technology
 * Research Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/) All
 * Rights Reserved.
 * 
 * @author Michael Schäfer, Achim Müller
 */

@Service
@Transactional
public class DataInitializer {

	@Autowired
	PlatformTransactionManager txManager;
	
	@Autowired
	private AircraftRepository aircraftRepository;

	@Autowired
	private RouteRepository routeRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@PostConstruct
	@Transactional
	public void init () {
		
		initAircrafts();
		initEmployees();
		initRoutes();
	}

	private void initAircrafts () {
		aircraftRepository.save(new Aircraft(1, "A319", "D-AILA"));
		aircraftRepository.save(new Aircraft(2, "A320", "D-AIPA"));
		aircraftRepository.save(new Aircraft(3, "A380", "D-AIMA"));
	}

	private void initEmployees () {
		
		Employee employee = new Employee("P234238", "Fred", "Flieger");

		Pilot pilot = new Pilot("RF775566734", new String[] { "A380" });
		employee.setRole(pilot);

		employeeRepository.save(employee);

		employee = new Employee("P234234", "Tom", "Stewart");

		CabinAttendant cabinAttendant = new CabinAttendant(1);
		employee.setRole(cabinAttendant);

		employeeRepository.save(employee);
	}

	public void initRoutes () {

		Route savedRoute = null;
		
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setName("InitRouteTx");
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

		TransactionStatus status = txManager.getTransaction(def);
		try {
			Route route = new Route("LH444", "Koeln", "Muenchen");
			route.addScheduledWeekday(DayOfWeek.MONDAY);
			route.addScheduledWeekday(DayOfWeek.FRIDAY);
			route.setTime(LocalTime.of(8, 0));
		
			Flight flight = new Flight(120.45, LocalDate.of(2015, 9, 23));
			Aircraft aircraft1 = this.aircraftRepository.findByRegistration("D-AIMA");
			flight.setAircraft(aircraft1);
			route.addFlight(flight);
			//aircraft1.addFlight(flight);

			flight = new Flight(111.45, LocalDate.of(2015, 9, 24));
			route.addFlight(flight);

			savedRoute = routeRepository.save(route);
		}
		catch (Exception ex) {
		    txManager.rollback(status);
		    throw ex;
		}
		txManager.commit(status);

		Route newRoute = this.routeRepository.findOne(savedRoute.getId());
		System.out.println("FlightNumber="+newRoute.getFlightNumber());
		System.out.println("Flight[0]="+newRoute.getFlights().get(0));
		System.out.println("Flight[0].aircraft="+newRoute.getFlights().get(0).getAircraft().getRegistration());
	}
}
