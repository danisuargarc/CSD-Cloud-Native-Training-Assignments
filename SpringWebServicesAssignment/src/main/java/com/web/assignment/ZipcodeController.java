package com.web.assignment;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create a RESTful web service that returns state, city, and country information when user passes zipcode. You can send state, 
 * city, and country information in JSON format.
 * 
 * GET: http://localhost:8080/zipcode/{zipcode}
 * 
 * @author dgarci11
 *
 */
@RestController
public class ZipcodeController {

	@RequestMapping(value="/zipcode/{zipcode}", method=RequestMethod.GET)
	public Zipcode zipcodeSearch(@PathVariable("zipcode") String zipcode) {
		if (ZipcodeRepo.contains(zipcode)) {
			return ZipcodeRepo.getZipcode(zipcode);
		}
		
		return new Zipcode(zipcode, "value not in database", "value not in database", "value not in database");
	}
	
}