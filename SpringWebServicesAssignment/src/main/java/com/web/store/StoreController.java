package com.web.store;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
public class StoreController {

	@RequestMapping(value="/order/all", method=RequestMethod.GET)
	public ArrayList<Order> orderGetAll() {
		return Repository.getAllOrders();
	}
	@RequestMapping(value="/order/{id}", method=RequestMethod.GET)
	public Order orderGetOne(@PathVariable("id") int id) {
		return Repository.getOrder(id);
	}
	@RequestMapping(value="/order/add", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Order addOrder(@RequestBody Order object) {
		return Repository.addOrder(object);
	}
	@RequestMapping(value="/order/update", method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Order update(@RequestBody Order object) {
		return Repository.updateOrder(object);
	}
	@RequestMapping(value="/order/delete/{id}", method=RequestMethod.GET)
	public String deleteOrder(@PathVariable("id") int id) {
		return Repository.deleteOrder(id);
	}
	@RequestMapping(value="/order/{id}/items", method=RequestMethod.GET)
	public ArrayList<LineItem> orderGetItems(@PathVariable("id") int id) {
		return Repository.getOrder(id).getLineItems();
	}
	@RequestMapping(value="/order/{id}/add", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<LineItem> orderAddItem(@PathVariable("id") int id, @RequestBody LineItem object) {
		Repository.getOrder(id).addLineItem(object);
		return Repository.getOrder(id).getLineItems();
	}
	@RequestMapping(value="/order/{id}/delete/{item}", method=RequestMethod.GET)
	public ArrayList<LineItem> orderDeleteItem(@PathVariable("id") int id, @PathVariable("item") int item) {
		Repository.getOrder(id).removeLineItem(item);
		return Repository.getOrder(id).getLineItems();
	}

	@RequestMapping(value="/product/all", method=RequestMethod.GET)
	public ArrayList<Product> productGetAll() {
		return Repository.getAllProducts();
	}
	@RequestMapping(value="/product/{id}", method=RequestMethod.GET)
	public Product productGetOne(@PathVariable("id") int id) {
		return Repository.getProduct(id);
	}
	@RequestMapping(value="/product/add", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Product addProduct(@RequestBody Product object) {
		return Repository.addProduct(object);
	}
	@RequestMapping(value="/product/update", method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Product update(@RequestBody Product object) {
		return Repository.updateProduct(object);
	}
	@RequestMapping(value="/product/delete/{id}", method=RequestMethod.GET)
	public String deleteProduct(@PathVariable("id") int id) {
		return Repository.deleteProduct(id);
	}

	@RequestMapping(value="/customer/all", method=RequestMethod.GET)
	public ArrayList<Customer> customerGetAll() {
		return Repository.getAllCustomers();
	}
	@RequestMapping(value="/customer/{id}", method=RequestMethod.GET)
	public Customer customerGetOne(@PathVariable("id") int id) {
		return Repository.getCustomer(id);
	}
	@RequestMapping(value="/customer/add", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Customer addCustomer(@RequestBody Customer object) {
		return Repository.addCustomer(object);
	}
	@RequestMapping(value="/customer/update", method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Customer update(@RequestBody Customer object) {
		return Repository.updateCustomer(object);
	}
	@RequestMapping(value="/customer/delete/{id}", method=RequestMethod.GET)
	public String deleteCustomer(@PathVariable("id") int id) {
		return Repository.deleteCustomer(id);
	}

}