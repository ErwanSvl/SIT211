package poureleves.triangle;

import static org.junit.Assert.*;

import org.junit.Test;

import poureleves.compteur.CompteurInvalide;

public class TriangleTest {

	@Test
	public void testTriangle() throws TriangleInvalide {
		Triangle t = new Triangle(3, 4, 1);
		assertNotNull(t);
	}
	
	@Test(expected = TriangleInvalide.class)
	public void testTriangleInvalid1() throws TriangleInvalide {
		Triangle t = new Triangle(-1,4,4);
	}
	
	@Test(expected = TriangleInvalide.class)
	public void testTriangleInvalid2() throws TriangleInvalide {
		Triangle t = new Triangle(4,-1,4);
	}
	
	@Test(expected = TriangleInvalide.class)
	public void testTriangleInvalid3() throws TriangleInvalide {
		Triangle t = new Triangle(4,4,-1);
	}

	@Test
	public void testEstEquilateral() throws TriangleInvalide {
		Triangle t1 = new Triangle(3, 3, 3);
		assertTrue(t1.estEquilateral());
		
		Triangle t2 = new Triangle(3, 3, 4);
		assertFalse(t2.estEquilateral());
		
		Triangle t3 = new Triangle(3, 4, 3);
		assertFalse(t3.estEquilateral());
		
		Triangle t4 = new Triangle(4, 3, 3);
		assertFalse(t4.estEquilateral());
		
		Triangle t5 = new Triangle(3, 4, 4);
		assertFalse(t5.estEquilateral());
		
		Triangle t6 = new Triangle(4, 4, 3);
		assertFalse(t6.estEquilateral());
	}

	@Test
	public void testEstIsocele() throws TriangleInvalide {
		Triangle t1 = new Triangle(3, 3, 5);
		assertTrue(t1.estIsocele());
		
		Triangle t2 = new Triangle(3, 2, 2);
		assertTrue(t2.estIsocele());
		
		Triangle t3 = new Triangle(2, 3, 2);
		assertTrue(t3.estIsocele());
		
		Triangle t4 = new Triangle(2, 2, 2);
		assertTrue(t4.estIsocele());
		
		Triangle t5 = new Triangle(2, 3, 4);
		assertFalse(t5.estIsocele());
	}

	@Test
	public void testEstRectangle() throws TriangleInvalide {
		Triangle t1 = new Triangle(3, 4, 5);
		assertTrue(t1.estRectangle());
		
		Triangle t2 = new Triangle(4, 5, 3);
		assertTrue(t2.estRectangle());
		
		Triangle t3 = new Triangle(5, 3, 4);
		assertTrue(t3.estRectangle());
		
		Triangle t4 = new Triangle(6, 6, 6);
		assertFalse(t4.estRectangle());
	}

	@Test
	public void testToString() throws TriangleInvalide {
		Triangle t1 = new Triangle(6,6,6);
		String expected = "Triangle[6, 6, 6]";
		assertTrue(expected.equals(t1.toString()));
	}

	@Test
	public void testEstUnTriangle() {
		assertTrue(Triangle.estUnTriangle(2, 3, 5));
		assertTrue(Triangle.estUnTriangle(0, 0, 0));
		assertTrue(Triangle.estUnTriangle(2, 3, 2));
		assertFalse(Triangle.estUnTriangle(-1, 0, 0));
		assertFalse(Triangle.estUnTriangle(0, -1, 0));
		assertFalse(Triangle.estUnTriangle(0, 0, -1));
		assertFalse(Triangle.estUnTriangle(-1, -1, 0));
		assertFalse(Triangle.estUnTriangle(0, -1, -1));
		assertFalse(Triangle.estUnTriangle(-1, -1, -1));
		assertFalse(Triangle.estUnTriangle(2, 3, 45));
		assertFalse(Triangle.estUnTriangle(45, 3, 2));
		assertFalse(Triangle.estUnTriangle(2, 45, 3));
	}

}
