package voitures;

import java.util.Iterator;

public class Garage {
	private Auto The_garage[];
	private int tailleMaxGarage;
	private int nombreAutos;

	Garage(int taille_max_garage) {
		this.The_garage = new Auto[taille_max_garage];
		this.nombreAutos = 0;
		this.tailleMaxGarage = taille_max_garage;
	}

	void ajouter(Auto a) {
		if (this.nombreAutos < this.tailleMaxGarage) {
			this.The_garage[this.nombreAutos] = a;
			this.nombreAutos++;
		} else
			System.out.println("Garage d�j� satur�");
	}

	void afficher() {
		System.out.println("Affichage du garage");
		System.out.println();
		for (int i = 0; i < this.nombreAutos; i++) {
			System.out.println("   Voiture num�ro " + i + " :");
			this.The_garage[i].afficher();
			System.out.println();
		}
	}

	// -----------------------------------------------------------------

	public int f1(String m) {
		int compteur = 0;
		for (int i = 0; i < nombreAutos; i++) {
			if (The_garage[i].getMarque().equals(m)) {
				compteur++;
			}
		}
		return compteur;
	}

	public int f2(String m) {
		int compteur = 0;
		for (int i = 0; i < nombreAutos; i++) {
			if (The_garage[i].getModele().equals(m)) {
				compteur++;
			}
		}
		return compteur;
	}

	public int f3() {
		return nombreAutos;
	}

	public boolean f4() {
		return nombreAutos == 0;
	}

	public int f5() {
		if (nombreAutos == 0) {
			return 0;
		}
		int indice = 0;
		float consoMin = The_garage[0].getConso();
		for (int i = 1; i < nombreAutos; i++) {
			if (The_garage[i].getConso() < consoMin) {
				indice = i;
				consoMin = The_garage[i].getConso();
			}
		}
		return indice;
	}

	public int f6() {
		int indice = 0;
		float prix = -1;
		for (int i = 0; i < nombreAutos; i++) {
			if (The_garage[i].getPrix() > prix) {
				prix = The_garage[i].getPrix();
				indice = i;
			}
		}
		return indice;
	}

	public float f7() {
		if (nombreAutos == 0) {
			return 0;
		}
		float prixMax = The_garage[0].getPrix();
		float prixMin = prixMax;
		for (int i = 1; i < nombreAutos; i++) {
			float prix = The_garage[i].getPrix();
			if (prix > prixMax) {
				prixMax = prix;
			} else if (prix < prixMin) {
				prixMin = prix;
			}
		}
		return prixMax - prixMin;
	}

	public int f8() {
		if (nombreAutos == 0) {
			return 0;
		}

		int somme_km = 0;
		for (int i = 0; i < nombreAutos; i++) {
			somme_km += The_garage[i].getKilometrage();
		}
		return somme_km / nombreAutos;
	}

	public int f9() {
		int indice = -1;
		float prixMin = 999999999;
		for (int i = 0; i < nombreAutos; i++) {
			if(The_garage[i].getNbPlaces() >= 5 && The_garage[i].getNbPortes() == 5 && The_garage[i].getPrix() < prixMin) {
				indice = i;
				prixMin = The_garage[i].getPrix();
			}
		}
		return indice;
	}

	public int f10(int n, int k) {
		int indice = -1;
		float prixMin = 999999999;
		for (int i = 0; i < nombreAutos; i++) {
			if (The_garage[i].getNbPortes() >= n && The_garage[i].getKilometrage() < k
					&& The_garage[i].getPrix() < prixMin) {
				indice = i;
				prixMin = The_garage[i].getPrix();
			}
		}
		return indice;
	}

}
