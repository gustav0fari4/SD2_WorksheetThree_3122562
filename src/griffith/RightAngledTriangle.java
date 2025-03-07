package griffith;

public class RightAngledTriangle extends Shape{
	private double base;
	private double height;
	
	//Constructor to set name, base, and height
	public RightAngledTriangle(String name, double base, double height) {
		super(name);
		this.base = base;
		this.height = height;
	}
	
	//Getters
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	
	//Setters
	public void setBase(double base) {
		this.base = base;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	//Override the area method for Right-Angled Triangle
	@Override
	public double area() {
		return (base * height) / 2;
	}

	//Override the perimeter method for Right-ANgled Triangle
	@Override
	public double perimeter() {
		double hypotenuse = Math.sqrt(base * base + height * height);
		return base + height + hypotenuse;
	}
	
	//Override the toString method to include the base and height
	@Override
	public String toString() {
		return super.toString() + ", Base: " + base + ", Height: " + height;
	}
}
