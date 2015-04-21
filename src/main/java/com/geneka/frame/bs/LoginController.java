package com.geneka.frame.bs;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;



@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory
			.getLogger(LoginController.class);
	
	@RequestMapping(value = "/geneka/", method = RequestMethod.GET)
	public String openApp(@PathVariable String appBeanId, Locale locale,
			Model model) {
		logger.info("Returning hello view");
		return "index.html";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public String open(@PathVariable String appBeanId, Locale locale,
			org.springframework.ui.Model model) {
		logger.info("Returning hello view");
		return "index.html";
	}

}
