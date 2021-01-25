import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Remove the words that have odd lengths from the list. HINT: Use
 * one of the new methods from JDK 8. Use removeIf() method from
 * Collection interface.
 * 
 * @author dgarci11
 *
 */
public class Question4 {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		strings.add("One");
		strings.add("Two");
		strings.add("Three");
		strings.add("Four");
		strings.add("Five");
		
		Consumer<ArrayList<String>> print = list -> {
			list.removeIf(string -> (string.length() % 2 == 1));
		};
		
		print.accept(strings);
		System.out.println(strings);
	}

}
