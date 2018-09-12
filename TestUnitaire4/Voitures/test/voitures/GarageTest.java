package voitures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;

import voitures.Garage;
import static org.hamcrest.CoreMatchers.is;

public class GarageTest {

	private Garage garage1;
	private Auto auto1;
	private Auto auto2;
	private Auto auto3;

	@Rule
	public ErrorCollector collector = new ErrorCollector();

	public GarageTest() {
	}

	@Before
	public void setUp() {
		auto1 = new Auto("Peugeot", "206", 2500, 7, 220000, 5, 3);
		auto2 = new Auto("Peugeot", "307", 6000, 5, 15000, 5, 5);
		auto3 = new Auto("Tesla", "Modele S", 45000, 0, 5000, 5, 5);
		garage1 = new Garage(5);
		garage1.ajouter(auto1);
		garage1.ajouter(auto2);
		garage1.ajouter(auto3);
	}

	@After
	public void tearDown() {
	}

	/**
	 * Test of f1 method, of class Garage.
	 */
	@Test
	public void testF1() {
		collector.checkThat("Test F1", garage1.f1("Peugeot"), is(2));
	}

	/**
	 * Test of f2 method, of class Garage.
	 */
	@Test
	public void testF2() {
		collector.checkThat("Test F2", garage1.f2("206"), is(1));
	}

	/**
	 * Test of f3 method, of class Garage.
	 */
	@Test
	public void testF3() {
		collector.checkThat("Test F3", garage1.f3(), is(3));
	}

	/**
	 * Test of f4 method, of class Garage.
	 */
	@Test
	public void testF4() {
		collector.checkThat("Test F4", garage1.f4(), is(false));
	}

	/**
	 * Test of f5 method, of class Garage.
	 */
	@Test
	public void testF5() {
		collector.checkThat("Test F5", garage1.f5(), is(2));
	}

	/**
	 * Test of f6 method, of class Garage.
	 */
	@Test
	public void testF6() {
		collector.checkThat("Test F6", garage1.f6(), is(2));
	}

	/**
	 * Test of f7 method, of class Garage.
	 */
	@Test
	public void testF7() {
		collector.checkThat("Test F7", garage1.f7(), is((float) 42500));
	}

	/**
	 * Test of f8 method, of class Garage.
	 */
	@Test
	public void testF8() {
		collector.checkThat("Test F8", garage1.f8(), is(80000));
	}

	/**
	 * Test of f9 method, of class Garage.
	 */
	@Test
	public void testF9() {
		collector.checkThat("Test F9", garage1.f9(), is(1));
	}

	/**
	 * Test of f10 method, of class Garage.
	 */
	@Test
	public void testF10() {
		collector.checkThat("Test F10", garage1.f10(5, 50000), is(1));
	}

}