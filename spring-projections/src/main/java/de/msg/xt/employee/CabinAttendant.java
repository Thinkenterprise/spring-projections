package de.msg.xt.employee;

import javax.persistence.Entity;

@Entity
public class CabinAttendant extends Employee {

	public static enum Rank {
		Purser, PurserAssistant, Attendant
	}
	
	private Rank rank;
	
	public CabinAttendant() {
		super();
	}

	public CabinAttendant(String staffNumber) {
		super(staffNumber);
	}

	public CabinAttendant(String staffNumber, String firstName, String lastName) {
		super(staffNumber, firstName, lastName);
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
}
