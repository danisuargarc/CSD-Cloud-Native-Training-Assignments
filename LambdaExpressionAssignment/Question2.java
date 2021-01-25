import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Write an application using lambda expressions to print Orders having 2 criteria
 * implemented: 1) order price more than 10000 2) order status is ACCEPTED or
 * COMPLETED.
 * 
 * @author dgarci11
 *
 */
public class Question2 {

	public static List<Order> orders = Arrays.asList(
			new Order(12000, "IN PROGRESS"),
			new Order(10000, "COMPLETED"),
			new Order(92000, "COMPLETED"),
			new Order(3800, "IN PROGRESS"),
			new Order(22000, "ACCEPTED")
			);
	
	public static void main(String[] args) {
		Consumer<List<Order>> print = orders -> {
			orders.stream()
			.filter(order -> order.price > 10000)
			.filter(order -> order.status.equalsIgnoreCase("ACCEPTED") || order.status.equalsIgnoreCase("COMPLETED"))
			.forEach(order -> System.out.println(order.price + " " + order.status));
		};
		
		print.accept(orders);
	}

}

class Order {
	int price;
	String status;
	
	public Order(int price, String status) {
		this.price = price;
		this.status = status;
	}
}
