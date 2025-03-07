package griffith;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Create instances of each shape
		Shape circle = new Circle("Circle", 3.5);
		Shape rhombus = new Rhombus("Rhombus", 4.0, 5.0, 6.0);
		Shape triangle = new RightAngledTriangle("Right Angled Triangle", 3.0, 4.0);
		
		//Print information about each shape
		System.out.println(circle);
		System.out.println("Area: " + circle.area());
		System.out.println("Perimeter: " + circle.perimeter());
		System.out.println();
		
		System.out.println(rhombus);
		System.out.println("Area: " + rhombus.area());
		System.out.println("Perimeter: " + rhombus.perimeter());
		System.out.println();
		
		System.out.println(triangle);
		System.out.println("Area: " + triangle.area());
		System.out.println("Perimeter: " + triangle.perimeter());
		System.out.println();
		
		//Create an arrayList of shapes
		ArrayList<Shape> shapes = new ArrayList<>();
		
		//Add two of each subclass to the list
		shapes.add(new Circle("Circle", 3.5));
		shapes.add(new Circle("Circle", 5.0));
		shapes.add(new Rhombus("Rhombus", 4.0, 5.0, 6.0));
		shapes.add(new Rhombus("Rhombus", 6.0, 7.0, 8.0));
		shapes.add(new RightAngledTriangle("Right Angled Triangle", 3.0, 4.0));
		shapes.add(new RightAngledTriangle("Right Angled Triangle", 5.0, 12.0));
		
		//Loop through each shape in the list and display their details
		System.out.println("-----------------------");
		System.out.println("Printing out the list using a loop \n");
		for(Shape shape : shapes) {
			System.out.println(shape);
			System.out.println("Area: " + shape.area());
			System.out.println("Perimeter: " + shape.perimeter());
			System.out.println();
		}

		}

}
