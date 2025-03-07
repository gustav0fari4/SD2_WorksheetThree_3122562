package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeTest {
	private static final double EPSILON = 0.0001;
	
	//Unit test for Circle
	@Test
	public void testCircle() {
		Circle circle = new Circle("Circle", 3.5);
		//Test the area
		assertEquals(3.5 * 3.5 * Math.PI, circle.area(), EPSILON );
		//Test the parameter
		assertEquals(2 * Math.PI * 3.5, circle.perimeter(), EPSILON);
		//Test the toString method
		assertEquals("Shape: Circle, Radius: 3.5", circle.toString());
	}
	
	//Unit test for Rhombus
	@Test
	public void testRhombus() {
		Rhombus rhombus = new Rhombus("Rhombus", 4.0, 5.0, 6.0);
		//Test the area
		assertEquals(5.0 * 6.0 / 2.0, rhombus.area(), EPSILON);
		//Test the perimeter
		assertEquals(4 * 4.0, rhombus.perimeter(), EPSILON);
		//Test the toString method
		assertEquals("Shape: Rhombus, Side: 4.0, Diagonal 1: 5.0, Diagonal 2: 6.0", rhombus.toString());
	}
	
	//Unit test for RightAngledTriangle
	@Test
	public void testRightAngledTriangle() {
		RightAngledTriangle triangle = new RightAngledTriangle("Right Angled Triangle", 3.0, 4.0);
		//Test the area
		assertEquals(3.0 * 4.0 / 2.0, triangle.area(), EPSILON);
		//Test the perimeter
		double hypotenuse = Math.sqrt(3.0 * 3.0 + 4.0 * 4.0);
		assertEquals(3.0 + 4.0 + hypotenuse, triangle.perimeter(), EPSILON);
		//Test the toString method
		assertEquals("Shape: Right Angled Triangle, Base: 3.0, Height: 4.0", triangle.toString());
	}

}
