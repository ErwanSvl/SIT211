import java.util.*;
public class Simu {

	/**
	 * 
	 */
	public static void main(String[] args) {
		Aef aef = new Aef2tt(); // l'automate a simuler
		Scanner scan = new Scanner(System.in);
		while (true) {
		System.out.println("Veuillez entrer votre chaine de test");
		String input = scan.next();	
		if (aef.accepte(input)) System.out.println ("La chaine " + input + " est acceptée");
		else System.out.println ("La chaine " + input + " n'est pas acceptée");
		}
	}

}
