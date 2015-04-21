package com.geneka.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the localization database table.
 * 
 */
@Entity
@Table(name="localization")
@NamedQuery(name="Localization.findAll", query="SELECT l FROM Localization l")
public class Localization implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_localization", unique=true, nullable=false)
	private int idLocalization;

	@Column(length=255)
	private String altitude;

	@Column(length=255)
	private String length;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id_user", nullable=false)
	private User user;

	public Localization() {
	}

	public int getIdLocalization() {
		return this.idLocalization;
	}

	public void setIdLocalization(int idLocalization) {
		this.idLocalization = idLocalization;
	}

	public String getAltitude() {
		return this.altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}

	public String getLength() {
		return this.length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}