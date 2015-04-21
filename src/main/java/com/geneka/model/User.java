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
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_user", unique=true, nullable=false)
	private int idUser;

	@Column(length=255)
	private String address;

	@Temporal(TemporalType.DATE)
	@Column(name="date_of_birth")
	private Date dateOfBirth;

	@Column(length=255)
	private String email;

	@Column(name="frecuency_of_use", length=15)
	private String frecuencyOfUse;

	@Column(length=255)
	private String gender;

	@Column(name="last_name", length=255)
	private String lastName;

	@Column(length=255)
	private String name;

	@Column(nullable=false, length=255)
	private String password;

	private int phone;

	@Column(name="status_user")
	private byte statusUser;

	@Column(nullable=false, length=255)
	private String username;

	//bi-directional many-to-one association to Feedback
	@OneToMany(mappedBy="user")
	private List<Feedback> feedbacks;

	//bi-directional many-to-one association to Localization
	@OneToMany(mappedBy="user")
	private List<Localization> localizations;

	//bi-directional many-to-one association to Group
	@ManyToOne
	@JoinColumn(name="group_id_group", nullable=false)
	private Group group;

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

	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public byte getStatusUser() {
		return this.statusUser;
	}

	public void setStatusUser(byte statusUser) {
		this.statusUser = statusUser;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Feedback> getFeedbacks() {
		return this.feedbacks;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public Feedback addFeedback(Feedback feedback) {
		getFeedbacks().add(feedback);
		feedback.setUser(this);

		return feedback;
	}

	public Feedback removeFeedback(Feedback feedback) {
		getFeedbacks().remove(feedback);
		feedback.setUser(null);

		return feedback;
	}

	public List<Localization> getLocalizations() {
		return this.localizations;
	}

	public void setLocalizations(List<Localization> localizations) {
		this.localizations = localizations;
	}

	public Localization addLocalization(Localization localization) {
		getLocalizations().add(localization);
		localization.setUser(this);

		return localization;
	}

	public Localization removeLocalization(Localization localization) {
		getLocalizations().remove(localization);
		localization.setUser(null);

		return localization;
	}

	public Group getGroup() {
		return this.group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

}