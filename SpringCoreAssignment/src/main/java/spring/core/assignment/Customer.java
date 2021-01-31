package spring.core.assignment;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Customer implements InitializingBean, DisposableBean {
	private int customerId;
	private String customerName;
	private String customerContact;
	private Address customerAddress;
	
	public void print() {
		System.out.println(customerId + " - " + customerName + " - " + customerContact + " - " + customerAddress);
	}
	
	public Customer(int customerId, String customerName, String customerContact, Address customerAddress) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("(!) InitializingBean afterPropertiesSet() method called! ");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("(!) DisposableBean destroy() method called! ");
	}
	
	public void myInit() {
		System.out.println("(!) @PostConstruct myInit() method called! ");
	}
	
	public void myDestroy() {
		System.out.println("(!) @PostDestroy myDestroy() method called! ");
	}
}
