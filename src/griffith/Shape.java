package griffith;

public abstract class Shape {
	private String name;
	
	//COnstructor to the set name
	public Shape(String name) {
		this.name = name;
	}
	
	//Getter
	public String getName() {
		return name;
	}
	
	//Setter
	public void setName(String name) {
		this.name = name;
	}

	//Abstract methods for area and perimeter
	public abstract double area();
	public abstract double perimeter();
	
	//toString method to print the name of the shape
	@Override
	public String toString() {
		return "Shape: " + name;
		}
}
