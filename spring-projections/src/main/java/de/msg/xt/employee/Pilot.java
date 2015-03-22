package de.msg.xt.employee;

import javax.persistence.Entity;

@Entity
public class Pilot extends Employee {

	private String certificateNumber;
	private String[] allowedAircrafts;

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

	public String[] getAllowedAircrafts() {
		return allowedAircrafts;
	}

	public void setAllowedAircrafts(String[] allowedAircrafts) {
		this.allowedAircrafts = allowedAircrafts;
	}
}
