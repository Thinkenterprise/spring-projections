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
public class CabinAttendant extends Role {

	private int rank;
	
	public CabinAttendant() {
		super("CabinAttendant");
	}


	public CabinAttendant(int rank) {
		super("CabinAttendant");
		this.rank = rank;
	}



	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
}
