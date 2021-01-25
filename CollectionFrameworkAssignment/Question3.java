import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Create a ArrayList with few elements & print it in backward direction. Use ListIterator.
 * 
 * @author dgarci11
 *
 */
public class Question3 {

	public static void main(String[] args) {
		ArrayList<String> carMakes = new ArrayList<>();
		carMakes.add("Tesla");
		carMakes.add("Honda");
		carMakes.add("Nissan");
		carMakes.add("Ford");
		
		ListIterator<String> iterator = carMakes.listIterator(carMakes.size());
		
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}
	
}
