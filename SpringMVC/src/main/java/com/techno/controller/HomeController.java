package com.techno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	/*
	@RequestMapping("/home")
	public String home(Model model) 
	{
		model.addAttribute("data","i am sending a data");
		return "home";
	}
	*/
/*
	@RequestMapping("/home")
	public ModelAndView home() 
	{
		ModelAndView mv= new ModelAndView();
		mv.addObject("data","i am sending a data");
		mv.setViewName("home");
		return mv;
	}
*/	
	@RequestMapping(value="/home", method = RequestMethod.POST)
	public ModelAndView home() 
	{
		ModelAndView mv= new ModelAndView();
		mv.addObject("data","i am sending a data");
		mv.setViewName("home");
		return mv;
	}

}
