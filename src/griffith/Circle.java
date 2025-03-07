package griffith;

public class Circle extends Shape {
	private double radius;
	
	//Constructor to set name and radius
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	//Getter
	public double getRadius() {
		return radius;
	}
	
	//Setter
	public void setRadius(double radius) {
		this.radius = radius;
	}

	//Override the area method for Circle
	@Override
	public double area() {
		return 0;
	}

	//Override the perimeter method for Circle
	@Override
	public double perimeter() {
		return 0;
	}
	
	//Override the toString method to include the radius
	@Override
	public String toString() {
		return null;
	}
}
