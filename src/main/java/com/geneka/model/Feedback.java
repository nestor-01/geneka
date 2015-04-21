package com.geneka.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the feedback database table.
 * 
 */
@Entity
@Table(name="feedback")
@NamedQuery(name="Feedback.findAll", query="SELECT f FROM Feedback f")
public class Feedback implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_feedback", unique=true, nullable=false)
	private int idFeedback;

	@Lob
	private String comment;

	//bi-directional many-to-one association to Clasification
	@ManyToOne
	@JoinColumn(name="clasification_id_clasification", nullable=false)
	private Clasification clasification;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id_user", nullable=false)
	private User user;

	public Feedback() {
	}

	public int getIdFeedback() {
		return this.idFeedback;
	}

	public void setIdFeedback(int idFeedback) {
		this.idFeedback = idFeedback;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Clasification getClasification() {
		return this.clasification;
	}

	public void setClasification(Clasification clasification) {
		this.clasification = clasification;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}