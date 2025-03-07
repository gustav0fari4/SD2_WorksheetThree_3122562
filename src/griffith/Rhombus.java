package griffith;

public class Rhombus extends Shape{
	private double side;
	private double diagonal1;
	private double diagonal2;
	
	//Constructor to set the name, side, and diagonals
	public Rhombus(String name, double side, double diagonal1, double diagonal2) {
		super(name);
		this.side = side;
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}
	
	//Getters
	public double getSide() {
		return side;
	}
	public double getDiagonal1() {
		return diagonal1;
	}
	public double getDiagonal2() {
		return diagonal2;
	}
	
	//Setters
	public void setSide(double side) {
		this.side = side;
	}
	public void setDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	}
	public void setDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}
	
	//Override the perimeter method for Rhombus
	@Override
	public double area() {
		return 0;
	}
	
	//Override the perimeter method for Rhombus
	@Override
	public double perimeter() {
		return 0;
	}
	
	//Override the toString methods to include the side and diagonals
	@Override
	public String toString() {
		return null;
	}
	
	
}
