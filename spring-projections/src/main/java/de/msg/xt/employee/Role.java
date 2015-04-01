package de.msg.xt.employee;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

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
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Role extends AbstractEntity {
	
	private String roleName;

	public Role(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return roleName;
	}
}
