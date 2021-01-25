import java.util.Comparator;
import java.util.TreeSet;

/**
 * Write a class Person having weight, height & name. Create multiple person 
 * objects & print them in sorted order. In the sorting order first sort based 
 * upon their weight & it two persons have same weight them sort them based 
 * upon their height. Use TreeSet.
 * 
 * @author dgarci11
 *
 */
public class Question1 {

	public static void main(String[] args) {
		TreeSet<Person> people = new TreeSet<>(new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				int value = Integer.valueOf(p1.getWeight()).compareTo(Integer.valueOf(p2.getWeight()));
				
				if (value == 0) {
					value = Integer.valueOf(p1.getHeight()).compareTo(Integer.valueOf(p2.getHeight()));
				}
				
				return value;
			}
		});
		
		people.add(new Person(120, 60, "Rachel"));
		people.add(new Person(110, 62, "Monica"));
		people.add(new Person(135, 66, "Phoebe"));
		people.add(new Person(160, 72, "Ross"));
		people.add(new Person(160, 70, "Chandler"));
		people.add(new Person(165, 68, "Joey"));
		
		people.stream()
		.forEach(person -> System.out.println(person.toString()));
	}

}
