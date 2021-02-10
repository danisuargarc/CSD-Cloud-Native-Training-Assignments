package rabbitmq.assignment.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Create two services, "Customer" Service and "CustomerNotification" Service. Customer service will expose API for adding and 
 * viewing customers. CustomerNotification will add the newly added customer to the database. Write an application with these two 
 * services, whenever a new customer is added, customer service will send the message through queue to notification service, 
 * which will add the customer data in the database.
 * 
 * @author dgarci11
 *
 */
@SpringBootApplication
public class NotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationApplication.class, args);
	}

}
