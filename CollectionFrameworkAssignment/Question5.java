import java.util.Hashtable;

/**
 * Write a user defined class say Employee that overrides equals() & hashCode() 
 * methods. Equals() always returns true & hashCode() always returns a fixed 
 * number. Make such a class as key you HashTable. Observe the behavior while 
 * calling put & get methods.
 * 
 * @author dgarci11
 *
 */
public class Question5 {

	public static void main(String[] args) {
		Hashtable<Employee, Date> map = new Hashtable<>();
		map.put(new Employee("Daniel"), new Date(1, 6, 1999));
		map.put(new Employee("MattyB"), new Date(1, 6, 2003));
		map.put(new Employee("Liz"), new Date(8, 30, 1999));
		
		//Check out lines 10-19 in Employee.java
		
		System.out.println(map.get(new Employee("Daniel")));
		System.out.println(map.get(new Employee("MattyB")));
		System.out.println(map.get(new Employee("Liz")));
	}

}
