package de.msg.xt.employee;

import javax.persistence.Entity;
/**  
* Spring Projections Samples 
* Design and Development by msg Applied Technology Research
* Copyright (c) 2015 msg systems ag (http://www.msg-systems.com/)
* All Rights Reserved.
* 
* @author Michael Schäfer, Achim Müller 
*/
@Entity
public class Pilot extends Role {

	private String certificateNumber;
	private String[] allowedAircrafts;

	public Pilot() {
		super();
	}

	
	public Pilot(String certificateNumber, String[] allowedAircrafts) {
		super();
		this.certificateNumber = certificateNumber;
		this.allowedAircrafts = allowedAircrafts;
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
