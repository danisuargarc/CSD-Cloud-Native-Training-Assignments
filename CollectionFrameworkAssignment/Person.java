
public class Person {

	private int weight;
	private int height;
	private String name;
	
	public Person(int weight, int height, String name) {
		this.weight = weight;
		this.height = height;
		this.name = name;
	}
	public String toString() {
		return name + ", " + weight + " lbs., " + height + " inches";
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
