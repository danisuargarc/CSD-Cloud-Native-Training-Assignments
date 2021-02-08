package com.web.store;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Repository {
	private static Customer mark = new Customer(1, "Mark", "Zuckerberg", "1 Hacker Way", "Menlo Park", "California", "94025", "United States");
	private static Customer jeff = new Customer(2, "Jeff", "Bezos", "410 Terry Avenue North", "Seattle", "Washington", "98109", "United States");
	private static Customer elon = new Customer(3, "Elon", "Musk", "3500 Deer Creek Road", "Palo Alto", "California", "94304", "United States");
	
	private static Product ball = new Product(1, "Soccer Ball", 45.0);
	private static Product raygun = new Product(2, "Raygun", 20000000.00);
	private static Product banana = new Product(3, "Banana", 0.75);
	private static Product lawsuit = new Product(4, "Lawsuit", 1000000.00);
	
	private static Order markOrder = new Order(1, 0.0, LocalDate.parse("2020-12-03"), mark);
	private static Order jeffOrder = new Order(2, 0.0, LocalDate.parse("2020-12-31"), jeff);
	private static Order elonOrder = new Order(3, 0.0, LocalDate.parse("2020-01-06"), elon);
	
	private static ArrayList<Customer> customers = new ArrayList<Customer>(Arrays.asList(mark, jeff, elon));
	private static ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(ball, raygun, banana, lawsuit));
	private static ArrayList<Order> orders = new ArrayList<Order>(Arrays.asList(markOrder, jeffOrder, elonOrder));
	
	private static int customerCount = 3;
	private static int productCount = 4;
	private static int orderCount = 3;
	
	public static ArrayList<Customer> getAllCustomers() {
		return customers;
	}
	
	public static Customer getCustomer(int id) {
		for (Customer c : customers) {
			if (c.getId() == id) {
				return c;
			}
		}
		return new Customer(0, null, null, null, null, null, null, null);
	}
	
	public static Customer addCustomer(Customer c) {
		customerCount++;
		c.setId(customerCount);
		customers.add(c);
		return c;
	}
	
	public static String deleteCustomer(int id) {
		for (Customer c : customers) {
			if (c.getId() == id) {
				customers.remove(c);
				return "Successfully deleted";
			}
		}
		return "Not found";
	}
	
	public static Customer updateCustomer(Customer c2) {
		for (int x = 0; x < customers.size(); x++) {
			if (customers.get(x).getId() == c2.getId()) {
				customers.set(x, c2);
				return customers.get(x);
			}
		}
		return new Customer(0, null, null, null, null, null, null, null);
	}
	
	public static ArrayList<Product> getAllProducts() {
		return products;
	}
	
	public static Product getProduct(int id) {
		for (Product p : products) {
			if (p.getId() == id) {
				return p;
			}
		}
		return new Product(0, null, 0.0);
	}
	
	public static Product addProduct(Product p) {
		productCount++;
		p.setId(productCount);
		products.add(p);
		return p;
	}
	
	public static String deleteProduct(int id) {
		for (Product p : products) {
			if (p.getId() == id) {
				products.remove(p);
				return "Successfully deleted";
			}
		}
		return "Not found";
	}
	
	public static Product updateProduct(Product p2) {
		for (int x = 0; x < products.size(); x++) {
			if (products.get(x).getId() == p2.getId()) {
				products.set(x, p2);
				return products.get(x);
			}
		}
		return new Product(0, null, 0.0);
	}
	
	public static ArrayList<Order> getAllOrders() {
		return orders;
	}
	
	public static Order getOrder(int id) {
		for (Order o : orders) {
			if (o.getId() == id) {
				return o;
			}
		}
		return new Order(0, 0.0, null, null);
	}
	
	public static Order addOrder(Order o) {
		orderCount++;
		o.setId(orderCount);
		orders.add(o);
		return o;
	}
	
	public static String deleteOrder(int id) {
		for (Order o : orders) {
			if (o.getId() == id) {
				orders.remove(o);
				return "Successfully deleted";
			}
		}
		return "Not found";
	}
	
	public static Order updateOrder(Order o2) {
		for (int x = 0; x < orders.size(); x++) {
			if (orders.get(x).getId() == o2.getId()) {
				orders.set(x, o2);
				return orders.get(x);
			}
		}
		return new Order(0, 0.0, null, null);
	}
}
