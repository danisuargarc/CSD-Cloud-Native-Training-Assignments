package com.web.assignment;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create a RESTful web service that authenticates a user. User will specify his/her credentials i.e. username and password. If 
 * username and password are "admin" and "password," it should return "valid user" message, else "invalid user" message.
 * 
 * JSON POST: http://localhost:8080/authenticate
 * 
 * @author dgarci11
 *
 */
@RestController
public class AuthenticationController {

	@RequestMapping(value="/authenticate", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String authenticate(@RequestBody User user) {
		if (user.getUsername().equals("admin") && user.getPassword().equals("password")) {
			return "Valid User";
		}
		else {
			return "Invalid User";
		}
	}
	
}
