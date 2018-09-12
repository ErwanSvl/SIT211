
package messtats;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecupData {
	static private BufferedReader entree;

	public static void ouvrirFichier(String nomFichier){
		entree = null;
		try {
			entree = new BufferedReader(new FileReader(new File(nomFichier)));
		} catch (FileNotFoundException ex) {
			Logger.getLogger(RecupData.class.getName()).log(Level.SEVERE, null, ex);
		}
	}


	public static String lireFichier(){
		String s=null ;

		try {
			s=entree.readLine();
		} catch (IOException e) {
			System.out.println("Erreur d'entrée/sortie clavier");
		}
		return s;
	}


	public static int lireEntierFichier(String erreur){
		int i = 0;
		boolean iOk = false;
		while (!iOk) {
			try {
				i = Integer.parseInt(lireFichier());
				iOk = true;
			} catch (NumberFormatException e) {
				System.out.println(erreur);
			}
		}
		return i;
	}

}
