package com.geneka.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the module database table.
 * 
 */
@Entity
@Table(name="module")
@NamedQueries(
		{
		@NamedQuery(name="Module.findAll", query="SELECT m FROM Module m")
		})
public class Module implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_module", unique=true, nullable=false)
	private int idModule;

	@Column(length=255)
	private String name;

	@Column(length=255)
	private String path;

	@Column(name="parents_id")
	private Integer parentsId;

	
	public Module() {
	}

	public int getIdModule() {
		return this.idModule;
	}

	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getParentsId() {
		return parentsId;
	}

	public void setParentsId(Integer parentsId) {
		this.parentsId = parentsId;
	}

}