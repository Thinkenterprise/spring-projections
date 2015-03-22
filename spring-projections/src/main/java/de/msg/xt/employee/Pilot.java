package de.msg.xt.employee;

import javax.persistence.Entity;

import de.msg.xt.aircraft.Aircraft;

@Entity
public class Pilot extends Employee {

	private String certificateNumber;
	private Aircraft.Type[] allowedAircrafts;

	public Pilot() {
		super();
	}

	public Pilot(String staffNumber) {
		super(staffNumber);
	}

	public Pilot(String staffNumber, String firstName, String lastName) {
		super(staffNumber, firstName, lastName);
	}

	public String getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public Aircraft.Type[] getAllowedAircrafts() {
		return allowedAircrafts;
	}

	public void setAllowedAircrafts(Aircraft.Type[] allowedAircrafts) {
		this.allowedAircrafts = allowedAircrafts;
	}
}
