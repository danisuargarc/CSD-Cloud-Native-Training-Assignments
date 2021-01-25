import java.util.ArrayList;
import java.util.function.UnaryOperator;

/**
 * Replace every word in the list with its upper case equivalent. Use replaceAll()
 * method & UnaryOperator interface.
 * 
 * @author dgarci11
 *
 */
public class Question6 {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		strings.add("One");
		strings.add("Two");
		strings.add("Three");
		strings.add("Four");
		strings.add("Five");
		
		UnaryOperator<String> replace = string -> string.toUpperCase();
		
		strings.replaceAll(replace);
		
		System.out.println(strings);
	}

}
