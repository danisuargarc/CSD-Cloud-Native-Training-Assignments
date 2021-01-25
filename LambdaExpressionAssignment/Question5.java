import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Create a string that consists of the first letter of each word in the list
 * of Strings provided. HINT: Use Consumer interface & a StringBuilder to
 * construct the result.
 * 
 * @author dgarci11
 *
 */
public class Question5 {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		strings.add("Donut");
		strings.add("Apple");
		strings.add("Naan");
		strings.add("Ice Cream");
		strings.add("Eggs");
		strings.add("Limes");
		
		StringBuilder built = new StringBuilder();
		
		Consumer<ArrayList<String>> print = list -> {
			list.forEach(string -> built.append(string.charAt(0)));
		};
		
		print.accept(strings);
		System.out.println(built);
	}

}
