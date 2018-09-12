
public class Aef1 extends Aef{
	
	
	/**
	 * Teste si une chaine est acceptee par l'automate simule, en partant d'un etat donné
	 * La chaine sera acceptée ssi il existe dans l'automate un chemin correspondant à la chaine entree et menant de l'état passé en parametre à un état terminal
	 * Variante imperative 
	 * @param entree - la chaine de caracteres a tester
	 * @return - true si la chaine est acceptee, false sinon
	 */
	public boolean accepte (String entree){
		int etat = 1; // etat initial de l'automate
		int index = 0; // rang du premier caractere a traiter
		char carlu; // caractere courant

		while (index != entree.length()) { // tant qu'il reste des caracteres a traiter
			carlu = entree.charAt(index++); // lecture du caractere courant et passage au suivant
			if ((etat == 1)&&(carlu == 'a')) etat = 2;
			else if ((etat == 2)&&(carlu=='b')) etat=1;
			else return false ; // si aucune transition ne convient, l'automate refuse l'entree
		}
		// il n'y a plus rien a lire : est-on dans un etat terminal ?
		if (etat==2) return true; 
		else return false;


	}
	
	
}
