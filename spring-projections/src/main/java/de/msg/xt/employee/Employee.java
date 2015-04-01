package de.msg.xt.employee;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import de.msg.xt.core.AbstractEntity;

/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/

@Entity
public class Employee extends AbstractEntity {
	
	private String staffNumber;
	private String lastName;
	private String firstName;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Role role;


	public Employee() {
		super();
	}

	public Employee(String staffNumber) {
		super();
		this.staffNumber = staffNumber;
	}

	public Employee(String staffNumber, String firstName, String lastName) {
		super();
		this.staffNumber = staffNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getStaffNumber() {
		return staffNumber;
	}

	public void setStaffNumber(String staffNumber) {
		this.staffNumber = staffNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
