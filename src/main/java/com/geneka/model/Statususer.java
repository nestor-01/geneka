package com.geneka.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the statususer database table.
 * 
 */
@Entity
@NamedQuery(name="Statususer.findAll", query="SELECT s FROM Statususer s")
public class Statususer implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idStatusUser;
	private String status;

	public Statususer() {
	}


	@Id
	public int getIdStatusUser() {
		return this.idStatusUser;
	}

	public void setIdStatusUser(int idStatusUser) {
		this.idStatusUser = idStatusUser;
	}


	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}