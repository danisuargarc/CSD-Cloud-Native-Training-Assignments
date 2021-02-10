package com.mvc.assignment;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	private ArrayList<User> users = new ArrayList<>();
	
	@RequestMapping("/internationalLogin")
	public String showInternationalLoginForm() {
		return "internationalLogin";
	}
	
	@RequestMapping("/login")
	public String showLoginForm() {
		return "login";
	}
	
	@RequestMapping("/registration")
	public String showRegForm() {
		return "registration";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView submitForm(@RequestParam("username") String username, @RequestParam("password") String password) {
		boolean exists = false;
		
		for (User user : users) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				exists = true;
			}
		}
		
		if (!exists) {
			return new ModelAndView("redirect:http://localhost:8080/error");
		}
		else {
			return new ModelAndView("success", "message", username + " login success!");
		}
	}

	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public ModelAndView submitForm(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("email") String email) {
		if (password == "" || username == "" || email == "") {
			ModelAndView mav = new ModelAndView("redirect:http://localhost:8080/error");
			return mav;
		}
		else {
			users.add(new User(username, password, email));
			return new ModelAndView("redirect:http://localhost:8080/login");
		}
	}
}