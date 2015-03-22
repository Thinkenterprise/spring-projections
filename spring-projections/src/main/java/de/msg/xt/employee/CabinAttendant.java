package de.msg.xt.employee;

import javax.persistence.Entity;

@Entity
public class CabinAttendant extends Employee {

	private CabinRank rank;
	
	public CabinAttendant() {
		super();
	}

	public CabinAttendant(String staffNumber) {
		super(staffNumber);
	}

	public CabinAttendant(String staffNumber, String firstName, String lastName) {
		super(staffNumber, firstName, lastName);
	}

	public CabinRank getRank() {
		return rank;
	}

	public void setRank(CabinRank rank) {
		this.rank = rank;
	}
}
