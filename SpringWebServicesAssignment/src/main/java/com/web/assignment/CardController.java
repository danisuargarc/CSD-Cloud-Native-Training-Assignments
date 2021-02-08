package com.web.assignment;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create a RESTful web service that validates the credit card. It means we need to check the type of credit card like American 
 * Express, Discover, Visa, etc and it is valid or not.
 * 
 * GET: http://localhost:8080/card/{cardNumber}
 * 
 * @author dgarci11
 *
 */
@RestController
public class CardController {

	@RequestMapping(value="/card/{cardNumber}", method=RequestMethod.GET)
	public String cardValidate(@PathVariable("cardNumber") String card) {
		return CardValidator.validate(card);
	}

}