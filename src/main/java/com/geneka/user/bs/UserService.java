package com.geneka.user.bs;

import java.util.List;

import com.geneka.model.User;

public interface UserService {
	
	public List<User> getAllUsers() throws Exception;
	
	public User getUserById(Integer id) throws Exception;
	
	public List<User> getUserByName(String name, String lastName) throws Exception;
	
	public boolean saveUser(User user) throws Exception;
	
	public boolean deleteUser(Integer userId) throws Exception;
	

}
