package com.geneka.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the category database table.
 * 
 */
@Entity
@Table(name="category")
@NamedQueries(
		{
		@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
		})
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_category", unique=true, nullable=false)
	private int idCategory;

	@Column(length=255)
	private String description;

	@Column(length=255)
	private String name;

	private int value;

	@Column(name="parents_id")
	private Integer parentsId;

	public Category() {
	}

	public int getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
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

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Integer getParentsId() {
		return parentsId;
	}

	public void setParentsId(Integer parentsId) {
		this.parentsId = parentsId;
	}

}