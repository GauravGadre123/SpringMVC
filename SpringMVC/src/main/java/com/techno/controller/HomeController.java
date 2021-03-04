package com.techno.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.techno.model.User;
import com.techno.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	/*
	 * @RequestMapping("/home") public String home(Model model) {
	 * model.addAttribute("data","i am sending a data"); return "home"; }
	 */
	/*
	 * @RequestMapping("/home") public ModelAndView home() { ModelAndView mv= new
	 * ModelAndView(); mv.addObject("data","i am sending a data");
	 * mv.setViewName("home"); return mv; }
	 */
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "i am sending a data");
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("/input")
	public String showForm() {

		return "input";
	}

	/*
	 * @RequestMapping(value="/show_data",method = RequestMethod.POST) public void
	 * showData(HttpServletRequest request) {
	 * System.out.println(request.getParameter("email"));
	 * 
	 * System.out.println(request.getParameter("password"));
	 * 
	 * }
	 */
	/*
	 * @RequestMapping(value="/show_data",method = RequestMethod.POST) public String
	 * showData(Model model,@RequestParam("email") String
	 * userEmail,@RequestParam("password") String userPassword) {
	 * System.out.println(userEmail);
	 * 
	 * System.out.println(userPassword);
	 * 
	 * model.addAttribute("email",userEmail);
	 * 
	 * model.addAttribute("password",userPassword); return "home"; }
	 * 
	 */
	/*
	 * @RequestMapping(value="/show_data",method = RequestMethod.POST) public String
	 * showData(@ModelAttribute User user,Model model) { userService.saveUser(user);
	 * model.addAttribute("user",user); return "redirect:/success"; }
	 */
	@RequestMapping(value = "/show_data", method = RequestMethod.POST)
	public RedirectView showData(@ModelAttribute User user, Model model) {
		userService.saveUser(user);
		model.addAttribute("user", user);

		RedirectView rv = new RedirectView();
		rv.setUrl("success");
		return rv;

	}

	@RequestMapping(value = "/success")
	public String successPage() {
		System.out.println("hiiii ");
		return "success";

	}

    // for getting values from url

	@RequestMapping(value = "/show_values/{id}/{name}")
	public String showValues(@PathVariable("id") int uid, @PathVariable("name") String uname) {
		System.out.println(uid);

		System.out.println(uname);
		return "";

	}

}
