package com.geneka.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the group database table.
 * 
 */
@Entity
@Table(name="group")
@NamedQueries(
		{
		@NamedQuery(name="Group.findAll", query="SELECT g FROM Group g")
		})
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_group", unique=true, nullable=false)
	private int idGroup;

	@Column(length=255)
	private String name;

	@Column(name="module_id_module", nullable=false)
	private Integer moduleIdModule;

	
	public Group() {
	}

	public int getIdGroup() {
		return this.idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getModuleIdModule() {
		return moduleIdModule;
	}

	public void setModuleIdModule(Integer moduleIdModule) {
		this.moduleIdModule = moduleIdModule;
	}

}