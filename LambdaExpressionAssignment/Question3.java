import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Use the functional interfaces Supplier, Consumer, Predicate & Function to
 * invoke built-in methods from Java API 8.
 * 
 * @author dgarci11
 *
 */
public class Question3 {

	public static void main(String[] args) {
		//Supplier
		System.out.println("Supplier<String>");
		Supplier<String> supplier = () -> "Hello Supplier!";
		System.out.println("supplier.get() -> " + supplier.get());
		System.out.println();
		
		//Consumer
		System.out.println("Consumer<Integer>");
		Consumer<Integer> consumer = value -> System.out.println("Hello Consumer! You chose " + 10);
		System.out.print("consumer.accept(10) -> ");
		consumer.accept(10);
		System.out.println();
		
		//Predicate
		System.out.println("Predicate<String>");
		Predicate<String> predicate = value -> value.equalsIgnoreCase("Hello Predicate!");
		System.out.println("predicate.test(\"Hello Predicate!\") -> " + predicate.test("Hello Predicate!"));
		System.out.println();
		
		//Function
		System.out.println("Function<String, Integer>");
		Function<String, Integer> function = string -> string.length();
		System.out.println("function.apply(\"Hello Function!\") -> " + function.apply("Hello Function!"));
	}

}
