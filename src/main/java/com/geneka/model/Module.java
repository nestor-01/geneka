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
@NamedQuery(name="Module.findAll", query="SELECT m FROM Module m")
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

	//bi-directional many-to-one association to Group
	@OneToMany(mappedBy="module")
	private List<Group> groups;

	//bi-directional many-to-one association to Module
	@ManyToOne
	@JoinColumn(name="parents_id")
	private Module module;

	//bi-directional many-to-one association to Module
	@OneToMany(mappedBy="module")
	private List<Module> modules;

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

	public List<Group> getGroups() {
		return this.groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public Group addGroup(Group group) {
		getGroups().add(group);
		group.setModule(this);

		return group;
	}

	public Group removeGroup(Group group) {
		getGroups().remove(group);
		group.setModule(null);

		return group;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public List<Module> getModules() {
		return this.modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public Module addModule(Module module) {
		getModules().add(module);
		module.setModule(this);

		return module;
	}

	public Module removeModule(Module module) {
		getModules().remove(module);
		module.setModule(null);

		return module;
	}

}