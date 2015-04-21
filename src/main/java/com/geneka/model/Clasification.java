package com.geneka.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the clasification database table.
 * 
 */
@Entity
@Table(name="clasification")
@NamedQuery(name="Clasification.findAll", query="SELECT c FROM Clasification c")
public class Clasification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_clasification", unique=true, nullable=false)
	private int idClasification;

	@Lob
	private String description;

	@Column(length=255)
	private String name;

	//bi-directional many-to-one association to Feedback
	@OneToMany(mappedBy="clasification")
	private List<Feedback> feedbacks;

	public Clasification() {
	}

	public int getIdClasification() {
		return this.idClasification;
	}

	public void setIdClasification(int idClasification) {
		this.idClasification = idClasification;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Feedback> getFeedbacks() {
		return this.feedbacks;
	}

	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public Feedback addFeedback(Feedback feedback) {
		getFeedbacks().add(feedback);
		feedback.setClasification(this);

		return feedback;
	}

	public Feedback removeFeedback(Feedback feedback) {
		getFeedbacks().remove(feedback);
		feedback.setClasification(null);

		return feedback;
	}

}