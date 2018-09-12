public class Aef2tt extends Aef{

	public boolean accepte (String entree){
		int etat = initial(); // etat initial de l'automate
		int index = 0; // rang du premier caractere a traiter
		char carlu; // caractere courant

		while (index != entree.length()) { // tant qu'il reste des caracteres a traiter
			carlu = entree.charAt(index++); // lecture du caractere courant et passage au suivant
			etat = transition(etat, carlu);
		}
		// il n'y a plus rien a lire : est-on dans un etat terminal ?
		return isTerminal(etat);
	}
	
	private int transition (int EtatCourant, char symboleLu) {
		switch (EtatCourant) {
			case 0:
				if (symboleLu == 'a') return 1; 
				break;
			case 1:
				if (symboleLu == 'b') return 2;
				break;
			case 2:
				if (symboleLu == 'a') return 3;
				else if (symboleLu == 'b') return 3; 
				break;
			case 3:
				if (symboleLu == 'a') return 3;
				else if (symboleLu == 'b') return 4; 
				break;
			case 4:
				if (symboleLu == 'a') return 5;
				else if (symboleLu == 'b') return 4;
				break;
			case 5:
				if (symboleLu == 'a') return 3;
				else if (symboleLu == 'b') return 4;
				break;
		}
		return -1;
	}
	
	private boolean isTerminal(int etat) {
		if (etat == 2 || etat == 5) return true;
		else return false;
	}
	
	private int initial() {
		return 0;
	}
}
