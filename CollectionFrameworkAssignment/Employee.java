
public class Employee {

	String name;

	public Employee(String name) {
		this.name = name;
	}

	//Question5 code here
	@Override
	public int hashCode() {
		return 10;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
}
