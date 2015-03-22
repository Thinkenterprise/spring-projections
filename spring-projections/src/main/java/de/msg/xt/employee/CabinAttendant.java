package de.msg.xt.employee;

import javax.persistence.Entity;

@Entity
public class CabinAttendant extends Employee {

	private int rank;
	
	public CabinAttendant() {
		super();
	}

	public CabinAttendant(String staffNumber) {
		super(staffNumber);
	}

	public CabinAttendant(String staffNumber, String firstName, String lastName) {
		super(staffNumber, firstName, lastName);
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
}
