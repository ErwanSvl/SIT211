package poureleves.compteur;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Fabien Dagnat <fabien.dagnat@telecom-bretagne.eu>
 */
public class CompteurTest {

	/**
	 * Test method for {@link poureleves.compteur.Compteur#ajouterVal(int)}.
	 * 
	 * @throws CompteurInvalide
	 */
	@Test
	public final void testAjouterVal() throws CompteurInvalide {
		Compteur c1;
		c1 = new Compteur(5);
		c1.ajouterVal(4);
		// premiere assertion de test :
		// si la valeur du compteur est differente de 9, on provoque un echec du test :
		assertEquals(9, c1.getVal());
		// 
		c1.ajouterVal(3);
		// deuxieme assertion de test
		// on utilise ici la possibilite d'adjoindre un message d'erreur :
		assertEquals("Le compteur devrait valoir 12", 12, c1.getVal());
	}

	/**
	 * Test method for {@link poureleves.compteur.Compteur#Compteur(int)}. Le test, ici, attend que le
	 * constructeur leve l'exception precisee dans l'annotation
	 * 
	 * @throws CompteurInvalide
	 */
	@Test(expected = CompteurInvalide.class)
	public final void testCreation() throws CompteurInvalide {
		new Compteur(-2);
	}
}
