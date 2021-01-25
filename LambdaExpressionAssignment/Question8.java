import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Create a new thread that prints the numbers from the list. Use class
 * Thread & interface Consumer.
 * 
 * @author dgarci11
 *
 */
public class Question8 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		Consumer<ArrayList<Integer>> print = list -> {
			list.forEach(number -> System.out.print(number + " "));
		};
		
		Thread thread = new Thread(() -> print.accept(numbers));
		thread.start();
	}

}
