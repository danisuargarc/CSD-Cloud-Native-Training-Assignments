package com.web.assignment;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create a Calculator RESTful service that provides the following functionality.
 * 
 * GET: http://localhost:8080/calc/add/{num1}/{num2}
 * GET: http://localhost:8080/calc/sub/{num1}/{num2}
 * GET: http://localhost:8080/calc/mult/{num1}/{num2}
 * GET: http://localhost:8080/calc/div/{num1}/{num2}
 * GET: http://localhost:8080/calc/sqrt/{num}
 * 
 * @author dgarci11
 *
 */
@RestController
public class CalculatorController {

	@RequestMapping(value="/calc/add/{num1}/{num2}", method=RequestMethod.GET)
	public double add(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
		return num1 + num2;
	}
	
	@RequestMapping(value="/calc/sub/{num1}/{num2}", method=RequestMethod.GET)
	public double sub(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
		return num1 - num2;
	}
	
	@RequestMapping(value="/calc/mult/{num1}/{num2}", method=RequestMethod.GET)
	public double mult(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
		return num1 * num2;
	}
	
	@RequestMapping(value="/calc/div/{num1}/{num2}", method=RequestMethod.GET)
	public double div(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
		return num1 / num2;
	}
	
	@RequestMapping(value="/calc/sqrt/{num}", method=RequestMethod.GET)
	public double sqrt(@PathVariable("num") double num) {
		return Math.sqrt(num);
	}

}