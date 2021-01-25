import java.util.HashMap;
import java.util.Map;

/**
 * Convert every key-value pair of the map into a string and append them
 * all into a single string, in iteration order. HINT: Use Map.entrySet()
 * method & a StringBuilder to construct the result String;
 * 
 * @author dgarci11
 *
 */
public class Question7 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("First", "Joel");
		map.put("Second", "Daniel");
		map.put("Third", "Nataly");
		
		StringBuilder built = new StringBuilder();
		
		for (Map.Entry<String, String> x : map.entrySet()) {
			built.append(x.getKey());
			built.append(x.getValue());
		}

		System.out.println(built);
	}

}
