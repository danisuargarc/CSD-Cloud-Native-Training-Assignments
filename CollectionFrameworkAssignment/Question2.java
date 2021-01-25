import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Prove that HashSet is unordered & LinkedHashSet is ordered.
 * 
 * @author dgarci11
 *
 */
public class Question2 {

	public static void main(String[] args) {
		HashSet<Integer> hash = new HashSet<>();
		hash.add(1);
		hash.add(4);
		hash.add(5);
		hash.add(3);
		hash.add(2);
		
		LinkedHashSet<Integer> linked = new LinkedHashSet<>();
		linked.add(1);
		linked.add(4);
		linked.add(5);
		linked.add(3);
		linked.add(2);

		System.out.println("HashSet: " + hash);
		System.out.println("LinkedHashSet: " + linked);
		
		System.out.println("\nLinkedHashSet maintains the insertion order. HashSet does not.");
	}

}
