package com.mvc.assignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	String[] cities = { "Portage", "Schenectady" };
	int[] zipcodes = { 46368, 12302 };
	
	@RequestMapping("/valreg")
	public String showRegForm() {
		return "valreg";
	}

	@RequestMapping(value="/valreg", method=RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("customer") Customer customer) {
		for (int x = 0; x < cities.length; x++) {
			if (cities[x].equals(customer.getCity()) && zipcodes[x] == customer.getZipcode()) {
				return new ModelAndView("valRegSuccess");
			}
		}
		
		return new ModelAndView("valreg", "error", customer.getZipcode() + " does not belong to " + customer.getCity());
	}
}
