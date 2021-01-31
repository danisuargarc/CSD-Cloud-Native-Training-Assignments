package spring.core.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create an Address class with the following attributes: street, city, state, zip, county.
 * Create an Customer class with the following attributes: customerId, customerName, customerContact,
 * customerAddress.
 * Inject the Address bean into Customer bean using setter injection.
 * Create a Question1 class with main() method, get Customer bean from ApplicationContext object and print
 * details of Customer.
 * - Modify the above application and inject the bean using constructor injection
 * - Use XML based Configuration
 * 
 * @author dgarci11
 * 
 */
public class Question1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("q1.xml");
		Customer customer1 = (Customer) context.getBean("customer1");
		customer1.print();
	}

}
