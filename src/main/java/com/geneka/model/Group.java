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
@NamedQuery(name="Group.findAll", query="SELECT g FROM Group g")
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_group", unique=true, nullable=false)
	private int idGroup;

	@Column(length=255)
	private String name;

	//bi-directional many-to-one association to Module
	@ManyToOne
	@JoinColumn(name="module_id_module", nullable=false)
	private Module module;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="group")
	private List<User> users;

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

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setGroup(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setGroup(null);

		return user;
	}

}