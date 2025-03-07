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

}
