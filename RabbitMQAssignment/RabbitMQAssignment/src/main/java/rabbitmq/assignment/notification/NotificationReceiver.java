package rabbitmq.assignment.notification;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Component;
import rabbitmq.assignment.customer.Customer;

@Component
public class NotificationReceiver {

	public void receiveCustomer(Customer customer) {
		System.out.println("(!) Received Customer with " + customer);
		addToDatabase(customer.toString());
	}

	/**
	 * Currently adds to text document, but would ideally be added to a database
	 * 
	 * @param customer
	 */
	private void addToDatabase(String customer) {
		try {
			System.out.println("(!) Adding Customer to Database");
			File file = new File("database.txt");
			
			if (file.createNewFile()) {
				System.out.println("(!) Created database.txt");
				BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
				bw.newLine();
				bw.write(customer);
				bw.close();
				System.out.println("(!) Customer Added to database.txt");
			} 
			else {
				BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
				bw.newLine();
				bw.write(customer);
				bw.close();
				System.out.println("(!) Customer Added to database.txt");
			}
		} catch (IOException e) {
			System.out.println("(!) Error Adding Customer to database.txt");
			e.printStackTrace();
		} 
	}

}
