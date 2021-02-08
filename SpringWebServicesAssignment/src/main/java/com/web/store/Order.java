package com.web.store;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
	private int id;
	private double total;
	private LocalDate localDate;
	private Customer customer;
	private ArrayList<LineItem> lineItems = new ArrayList<LineItem>();
	public Order(int id, double total, LocalDate localDate, Customer customer) {
		this.id = id;
		this.total = total;
		this.localDate = localDate;
		this.customer = customer;
	}
	public void addLineItem(LineItem lineItem) {
		total += (lineItem.getQuantity() * lineItem.getProduct().getCost());
		lineItems.add(lineItem);
	}
	public void removeLineItem(int id) {
		for (int x = 0; x < lineItems.size(); x++) {
			if (lineItems.get(x).getId() == id) {
				total -= (lineItems.get(x).getQuantity() * lineItems.get(x).getProduct().getCost());
				lineItems.remove(lineItems.get(x));
			}
		}
	}
	public ArrayList<LineItem> getLineItems() {
		return lineItems;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public LocalDate getDate() {
		return localDate;
	}
	public void setDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
