import java.util.HashMap;

/**
 * Write a program using HashTable or HashMap where Date of birth is a key & 
 * Employee name as value. Design the class Date is such a way where the get 
 * method fails if two employees have same day & month of birth but birth year 
 * is different.
 * 
 * @author dgarci11
 *
 */
public class Question4 {

	public static void main(String[] args) {
		HashMap<Date, Employee> map = new HashMap<>();
		map.put(new Date(1, 6, 1999), new Employee("Daniel"));
		map.put(new Date(1, 6, 2003), new Employee("MattyB"));
		map.put(new Date(8, 30, 1999), new Employee("Liz"));
		
		//Check lines 34-37 in Date.java
	}

}
