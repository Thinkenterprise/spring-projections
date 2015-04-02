package de.msg.xt.route;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import de.msg.xt.aircraft.Aircraft;
import de.msg.xt.core.AbstractEntity;
import de.msg.xt.employee.Employee;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

@Entity
public class Flight extends AbstractEntity {

	private double price;
	
	private LocalDate date;
	
	@OneToMany
	private Set<Employee> employees = new HashSet<Employee>();

	public Flight() {
		super();
	}
	
	public Flight(double price, LocalDate date) {
		super();
		this.price = price;
		this.date = date;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(Employee e) {
		this.employees.add(e);
	}
}
