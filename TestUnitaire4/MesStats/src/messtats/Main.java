package messtats;

public class Main {

	public static void main(String[] args) {
		String nomFichier="/homes/e17sevel/Documents/2A/SIT211/TestUnitaire4/entreeTP.txt";
		// TODO : Changer le nom du chemin !! 
		String mois;
		int jour, temp, pluvio, vent;
		Releve rel;
		Temperatures tTemp = new Temperatures();
		Pluviometrie tPluvio = new Pluviometrie();
		Vents tVent = new Vents();

		RecupData.ouvrirFichier(nomFichier);
		do {
			mois = RecupData.lireFichier();
			if (mois!=null)
			{
				jour = RecupData.lireEntierFichier("Erreur entier attendu dans fichier");
				temp = RecupData.lireEntierFichier("Erreur entier attendu dans fichier");
				pluvio = RecupData.lireEntierFichier("Erreur entier attendu dans fichier");
				vent = RecupData.lireEntierFichier("Erreur entier attendu dans fichier");
				rel = new Releve(mois,jour,temp,pluvio,vent);
				rel.afficher();
				calculsReleve('t',rel,tTemp);
				calculsReleve('p',rel,tPluvio);
				calculsReleve('v',rel,tVent);

			}
		} while (mois!=null);

	}

	static void calculsReleve(char c, Releve r, TraitementData t)
	{
		switch(c) {
		case 't': case 'T' :
			int temp = r.getTemp();
			t.majMaximum(temp);
			t.majMinimum(temp);
			t.incNbVal();
			t.majSomme(temp);
			t.afficher();
			break;
		case 'p': case 'P' :
			int pluie = r.getPluvio();
			t.majMaximum(pluie);
			t.majMinimum(pluie);
			t.incNbVal();
			t.majSomme(pluie);
			t.afficher();
			break ;
		case 'v': case 'V' :
			int vent = r.getVent();
			t.majMaximum(vent);
			t.majMinimum(vent);
			t.incNbVal();
			t.majSomme(vent);
			t.afficher();
			break ;
		default :
			System.out.println("Erreur de switch !") ;
			break ;
		}
	}
}
