package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/hello")
public class HelloWorldController

{
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public ModelAndView sayHello()
	{
		ModelAndView model=new ModelAndView("helloWorld"); //it will search helloWorld.jsp
		model.addObject("message", "Hello from Spring Controller!!!");
		return model;
	}
	
}
