package com.web.assignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create a RESTful web service that returns "Hello World" message.
 * 
 * GET: http://localhost:8080/helloWorld
 * 
 * @author dgarci11
 *
 */
@RestController
public class HelloWorldController {

	@RequestMapping(value="/helloWorld", method=RequestMethod.GET)
	public String helloWorld() {
		return "Hello World";
	}

}