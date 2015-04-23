package com.geneka.user.ws;

import java.util.List;
import java.util.Locale;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.geneka.common.util.Tools;
import com.geneka.model.User;
import com.geneka.user.bo.UserEngine;



@RestController
@RequestMapping("user")
public class UserWS {

	@Autowired
	UserEngine userEngine;
	
	private static final Logger logger = LoggerFactory
			.getLogger(UserWS.class);
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public @ResponseBody String getAllUsers() throws Exception
	{
		List<User> lstUsers = userEngine.getUsers();
		logger.info("consume service ------>>>");
		return Tools.serializeToJSon(lstUsers);
	}

}
