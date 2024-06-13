package com.ass.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ass.springweb.dto.RegisterDto;


@Controller
public class RegisterController {
	
	@RequestMapping(value="/saveUserDetails")
	public ModelAndView saveUserDetails(RegisterDto registerDto)//revice the request(method)//dispatcher identityfy the based on the url
	{//
		System.out.println(registerDto);
		return new ModelAndView("index.jsp");
	}
	

}
