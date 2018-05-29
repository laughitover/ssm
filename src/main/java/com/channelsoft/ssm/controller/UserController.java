package com.channelsoft.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.channelsoft.ssm.domain.User;
import com.channelsoft.ssm.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	private static Logger logger=Logger.getLogger(UserController.class);
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/query")
	public ModelAndView to(HttpServletRequest request,Model model){
		logger.debug("进入to()方法...");
		User user=userService.selectByPrimaryKey(1);
		request.setAttribute("user", user);
		return new ModelAndView("index");
	}

}
