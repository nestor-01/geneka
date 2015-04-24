package com.geneka.user.bs;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.apache.bcel.generic.RET;
import org.springframework.beans.factory.annotation.Autowired;

import com.geneka.common.dao.Dao;
import com.geneka.model.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	Dao dao;

	public List<User> getAllUsers() throws Exception {
		List<User> listUsers = dao.getAllItems(User.class);
		return listUsers;
	}

	public User getUserById(Integer id) throws Exception {
		User user = dao.findById(User.class, id);
		return user;
	}

	public List<User> getUserByName(String name, String lastName)
			throws Exception {
		return new ArrayList<User>();
	}

	public boolean saveUser(User user) throws Exception {
		user = dao.save(user);
		if(user.getIdUser() != null)
		{
			return false;
		}
		return true;
	}

	public boolean deleteUser(Integer userId) throws Exception {
		User user = dao.findById(User.class, userId);
		if(user == null)
		{
			return false;
		}
		dao.delete(user);
		return true;
	}

}
