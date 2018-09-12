package voitures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;

//import messtats.Releve;
import voitures.Auto;
import static org.hamcrest.CoreMatchers.is;

public class AutoTest {

	private Auto auto1;

	@Rule
	  public ErrorCollector collector= new ErrorCollector();
	
	public AutoTest() {
	}

	@Before
	public void setUp() {
		System.out.println("nouvelles instances");
		auto1 = new Auto("Renauld", "Scenic", 15000, 15, 1022, 5, 5);
	}

	@After
	public void tearDown() {
	}
	
	/**
	 * Test of getMarque method, of class Auto.
	 */
	@Test
	public void testGetMarque() {
		collector.checkThat("Test getMarque()", auto1.getMarque(), is("Renauld"));
	}
	
	/**
	 * Test of getModele method, of class Auto.
	 */
	@Test
	public void testGetModele() {
		collector.checkThat("Test GetModel()", auto1.getModele(), is("Scenic"));
	}

	/**
	 * Test of getPrix method, of class Auto.
	 */
	@Test
	public void testGetPrix() {
		collector.checkThat("Test GetPrix()", auto1.getPrix(), is((float) 15000));
	}

	/**
	 * Test of getConso method, of class Auto.
	 */
	@Test
	public void testGetConso() {
		collector.checkThat("Test GetConso()", auto1.getConso(), is((float) 15));
	}
	
	/**
	 * Test of getKilometrage method, of class Auto.
	 */
	@Test
	public void testGetKilometrage() {
		collector.checkThat("Test GetKilometrage", auto1.getKilometrage(), is(1022));
	}

	/**
	 * Test of getNbPortes method, of class Auto.
	 */
	@Test
	public void testGetNbPortes() {
		collector.checkThat("Test GetNbPorte()", auto1.getNbPortes(), is(5));
	}
	
	/**
	 * Test of getNbPlaces method, of class Auto.
	 */
	@Test
	public void testGetNbPlaces() {
		collector.checkThat("Test GetNbPlaces()", auto1.getNbPlaces(), is(5));
	}
}