package com.web.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Consume the Calculator RESTful web service by using RestTemplate.
 * 
 * @author dgarci11
 *
 */
@RestController
public class CalculatorControllerConsumer {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/add/{num1}/{num2}") 
	public double add(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
		String url = "http://localhost:8080/calc/add/" + num1 + "/" + num2;
		double result = restTemplate.getForObject(url, double.class);
		return result;
	}
	
	@GetMapping("/sub/{num1}/{num2}") 
	public double sub(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
		String url = "http://localhost:8080/calc/sub/" + num1 + "/" + num2;
		double result = restTemplate.getForObject(url, double.class);
		return result;
	}

	@GetMapping("/mult/{num1}/{num2}") 
	public double mult(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
		String url = "http://localhost:8080/calc/mult/" + num1 + "/" + num2;
		double result = restTemplate.getForObject(url, double.class);
		return result;
	}

	@GetMapping("/div/{num1}/{num2}") 
	public double div(@PathVariable("num1") double num1, @PathVariable("num2") double num2) {
		String url = "http://localhost:8080/calc/div/" + num1 + "/" + num2;
		double result = restTemplate.getForObject(url, double.class);
		return result;
	}

	@GetMapping("/sqrt/{num}") 
	public double sqrt(@PathVariable("num") double num) {
		String url = "http://localhost:8080/calc/sqrt/" + num;
		double result = restTemplate.getForObject(url, double.class);
		return result;
	}
}
