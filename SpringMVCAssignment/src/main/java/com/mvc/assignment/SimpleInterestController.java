package com.mvc.assignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController {

	@RequestMapping("/simpleInterest")
	public String showForm() {
		return "simpleInterest";
	}

	@RequestMapping(value="/simpleInterest/result", method=RequestMethod.POST)
	public ModelAndView submitForm(@RequestParam("principal") String principalAmount, @RequestParam("years") String numYears, @RequestParam("rate") String interestRate, ModelAndView mav) {
		double value = Double.parseDouble(principalAmount) * (Double.parseDouble(interestRate) / 100) * Integer.parseInt(numYears);
		
		mav.setViewName("result");
		mav.addObject("result", "Result: $" + value);
		
		return mav;
	}
}