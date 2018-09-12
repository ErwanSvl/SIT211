
package messtats;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import static org.hamcrest.CoreMatchers.is;

public class TraitementDataTest {
	private TraitementData instance;

	@Rule
	  public ErrorCollector collector= new ErrorCollector();
	
	public TraitementDataTest() {
	}

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@Before
	public void setUp() {
		System.out.println("nouvelle instance");
		instance = new TraitementData();
	}

	@After
	public void tearDown() {
	}


	/**
	 * Test of moyenne method, of class TraitementData.
	 * Error case
	 */
	@Test
	public void testMoyenneErreur() {
		System.out.println("Test de moyenne erreur div par zero");
		collector.checkThat("Test de moyenne erreur div par zero",instance.moyenne(),is((float)(0)));
	}

	/**
	 * Test of getMaximum method, of class TraitementData.
	 */
	@Test
	public void testGetMaximum() {
		System.out.println("Test de getMaximum");
		collector.checkThat("Test de getMaximum",instance.getMaximum(),is(-100));
	}

	/**
	 * Test of getMinimum method, of class TraitementData.
	 */
	@Test
	public void testGetMinimum() {
		System.out.println("Test de getMinimum");
		collector.checkThat("Test de getMinimum",instance.getMinimum(),is(2000));
	}

	/**
	 * Test of getNbVal method, of class TraitementData.
	 */
	@Test
	public void testGetNbVal() {
		System.out.println("Test de getNbVal");
		collector.checkThat("Test de getNbVal",instance.getNbVal(),is(0));
	}

	/**
	 * Test of getSomme method, of class TraitementData.
	 */
	@Test
	public void testGetSomme() {
		System.out.println("Test de getSomme");
		collector.checkThat("Test de getSomme",instance.getSomme(),is(0));
	}

	/**
	 * Test of majMaximum method, of class TraitementData.
	 */
	@Test
	public void testMajMaximum() {
		System.out.println("Test de majMaximum");
		int m=instance.getMaximum();
		instance.majMaximum(m+1);
		collector.checkThat("Test de majMaximum 1",instance.getMaximum(),is(m+1));
		instance.majMaximum(m);  
		collector.checkThat("Test de majMaximum 2",instance.getMaximum(),is(m+1));
	}

	/**
	 * Test of majMinimum method, of class TraitementData.
	 */
	@Test
	public void testMajMinimum() {
		System.out.println("Test de majMinimum");
		int m=instance.getMinimum();
		instance.majMinimum(m-1);
		collector.checkThat("Test de majMinimum 1",instance.getMinimum(),is(m-1));
		instance.majMinimum(m); 
		collector.checkThat("Test de majMinimum 2",instance.getMinimum(),is(m-1));
	}

	/**
	 * Test of incNbVal method, of class TraitementData.
	 */
	@Test
	public void testIncNbVal() {
		System.out.println("Test de incNbVal");
		int m=instance.getNbVal();
		instance.incNbVal();
		collector.checkThat("Test de incNbVal 1",instance.getNbVal(),is(m+1));
		instance.incNbVal(); 
		collector.checkThat("Test de incNbVal 2",instance.getNbVal(),is(m+2));
	}

	/**
	 * Test of majSomme method, of class TraitementData.
	 */
	@Test
	public void testMajSomme() {
		System.out.println("Test de majSomme");
		int m=instance.getSomme();
		instance.majSomme(50);
		collector.checkThat("Test de majSomme 1",instance.getSomme(),is(m+50));
		instance.majSomme(30); 
		collector.checkThat("Test de majSomme 2",instance.getSomme(),is(m+80));
	}

	/**
	 * Test of moyenne method, of class TraitementData.
	 */
	@Test
	public void testMoyenne() {
		System.out.println("Test de moyenne");
		instance.majSomme(100);
		instance.incNbVal();
		instance.incNbVal();
		instance.incNbVal();
		collector.checkThat("Test de moyenne",instance.moyenne(),is((float)(instance.getSomme())/instance.getNbVal()));
	}

}