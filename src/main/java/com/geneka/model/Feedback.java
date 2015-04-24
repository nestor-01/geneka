package com.geneka.model;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the feedback database table.
 * 
 */
@Entity
@Table(name="feedback")
@NamedQueries(
		{
		@NamedQuery(name="Feedback.findAll", query="SELECT f FROM Feedback f")
		})
public class Feedback implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_feedback", unique=true, nullable=false)
	private int idFeedback;

	@Lob
	private String comment;

	@Column(name="clasification_id_clasification")
	private Integer clasificationIdClasification;

	//bi-directional many-to-one association to User

	@Column(name="user_id_user", nullable=false)
	private Integer userIdUser;

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

	public Integer getClasificationIdClasification() {
		return clasificationIdClasification;
	}

	public void setClasificationIdClasification(Integer clasificationIdClasification) {
		this.clasificationIdClasification = clasificationIdClasification;
	}

	public Integer getUserIdUser() {
		return userIdUser;
	}

	public void setUserIdUser(Integer userIdUser) {
		this.userIdUser = userIdUser;
	}

}