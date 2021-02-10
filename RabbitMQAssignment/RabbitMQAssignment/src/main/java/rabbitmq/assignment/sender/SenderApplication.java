package rabbitmq.assignment.sender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rabbitmq.assignment.customer.Customer;

@SpringBootApplication
public class SenderApplication implements CommandLineRunner {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SenderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer customer = new Customer();
		customer.setId(1001);
		customer.setName("Michael Jackson");
		customer.setEmail("michael@legend.com");
		
		System.out.println("(!) Sending Customer with " + customer);
		rabbitTemplate.convertAndSend(SenderConfig.topicExchangeName, "Customer_Routing_Key", customer);
		System.out.println("(!) Customer Sent Successfully");
	}
	
}