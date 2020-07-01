package com.llearning.SpringMVCAnnotation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.llearning.SpringMVCAnnotation.models.UserModel;

@Controller
public class UserController 
{
	@Autowired
	UserModel userModel;
	@RequestMapping("/")
	public ModelAndView index()
	{
		userModel.setId("101");
		userModel.setName("Sakshi");
		userModel.setAddress("Vile Parle");
		ModelAndView mv = new ModelAndView();
		mv.addObject("userObj",userModel);
		mv.setViewName("index");
		return mv;
	}
}
