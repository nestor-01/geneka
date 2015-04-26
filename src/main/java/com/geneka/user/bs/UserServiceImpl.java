package com.geneka.user.bs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.aspectj.apache.bcel.generic.RET;
import org.springframework.beans.factory.annotation.Autowired;

import com.geneka.common.dao.Dao;
import com.geneka.model.User;

public class UserServiceImpl implements UserService 
{
	
	@Autowired
	Dao dao;

	public List<User> getAllUsers() throws Exception
	{
		List<User> listUsers = dao.getAllItems(User.class);
		return listUsers;
	}

	public User getUserById(Integer id) {
		User user = null;
		try
		{
			user = dao.findById(User.class, id);
		}catch(Exception e)
		{
			
		}
		return user;
	}

	public List<User> getUserByName(String name, String lastName) throws Exception 
	{
		return new ArrayList<User>();
	}

	public boolean saveUser(User user) throws Exception 
	{
		try
		{
			user = dao.save(user);
			if(user.getIdUser() != null)
			{
				return false;
			}
		}catch(Exception e)
		{
			
		}
		
		return true;
	}
	
	public boolean saveUser(String name, String lastName, String password,
			String gender, String email, String address, String phone,
			Integer groupId, String dateOfBirth) throws Exception 
	{
		try
		{
			if(password != null && password.trim().equals(""))
			{
				throw new Exception("Contrasena no debe ser nula");
			}
			if(groupId != null && groupId <= 0)
			{
				throw new Exception("Egrupo no debe ser nulo");
			}
			User user = new User();
			user.setName(name);
			user.setLastName(lastName);
			user.setPassword(password);
			user.setGender(gender);
			user.setEmail(email);
			user.setAddress(address);
			user.setPhone(groupId);
			user.setGroupId(groupId);
			user.setDateOfBirth(new Date(dateOfBirth));
			dao.save(user);
		}catch(Exception e)
		{
			throw new Exception("Error guardando el usuario");
		}
		return false;
	}

	public boolean deleteUser(Integer userId) throws Exception 
	{
		try
		{
			User user = dao.findById(User.class, userId);
			if(user == null)
			{
				return false;
			}
			dao.delete(user);
		}catch(Exception e)
		{
			
		}
		return true;
	}

}
