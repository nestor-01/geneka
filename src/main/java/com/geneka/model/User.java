package com.geneka.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name="user")
@NamedQueries(
		{
		@NamedQuery(name="User.findAll", query="SELECT u FROM User u")	
		})
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_user", unique=true, nullable=false)
	private int idUser;

	@Column(name="address",length=255)
	private String address;

	@Temporal(TemporalType.DATE)
	@Column(name="date_of_birth")
	private Date dateOfBirth;

	@Column(name="email",length=255)
	private String email;

	@Column(name="frecuency_of_use", length=15)
	private String frecuencyOfUse;

	@Column(name="gender",length=255)
	private String gender;

	@Column(name="last_name", length=255)
	private String lastName;

	@Column(name="name")
	private String name;

	@Column(name="password")
	private String password;

	@Column(name="phone")
	private Integer phone;

	@Column(name="status_user")
	private Integer statusUser;

	@Column(name="group_id_group")
	private Integer groupId;

	public User() {
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFrecuencyOfUse() {
		return this.frecuencyOfUse;
	}

	public void setFrecuencyOfUse(String frecuencyOfUse) {
		this.frecuencyOfUse = frecuencyOfUse;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	
	public Integer getStatusUser() {
		return statusUser;
	}

	public void setStatusUser(Integer statusUser) {
		this.statusUser = statusUser;
	}

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

}