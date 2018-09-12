package voitures;

import java.util.Iterator;

public class Garage {
	private Auto The_garage[];
	private int tailleMaxGarage;
	private int nombreAutos;

	Garage(int taille_max_garage)
	{
		this.The_garage = new Auto[taille_max_garage];
		this.nombreAutos = 0;
		this.tailleMaxGarage = taille_max_garage;
	}

	void ajouter(Auto a)
	{
		if (this.nombreAutos < this.tailleMaxGarage) {
			this.The_garage[this.nombreAutos] = a;
			this.nombreAutos++;
		}
		else System.out.println("Garage d�j� satur�");
	}

	void afficher()
	{
		System.out.println("Affichage du garage");
		System.out.println();
		for(int i=0; i < this.nombreAutos; i++){
			System.out.println("   Voiture num�ro "+i+" :");
			this.The_garage[i].afficher();
			System.out.println();
		}	
	}
	
	//-----------------------------------------------------------------
	
	public int f1(String m)
	{
		return 0;
	}

	public int f2(String m)
	{
		int compteur = 0;
		for (Auto auto : The_garage) {
			if (auto.equals(m)) {
				compteur++;
			}
		}
		return compteur;
	}

	public int f3()
	{
		return 0;
	}
	
	public boolean f4()
	{
		return The_garage.length == 0;
	}

	public int f5()
	{
		return 0;
	}

	public int f6()
	{
		int indice = 0;
		float prix = -1;
		for (int i = 0; i < The_garage.length; i++) {
			if(The_garage[i].getPrix() > prix) {
				prix = The_garage[i].getPrix();
				indice = i;
			}
		}
		return indice;
	}

	public float f7()
	{
		return 0;
	}

	public int f8()
	{
		if(The_garage.length == 0) {
			return 0;
		}
		
		int somme_km = 0;
		for (Auto auto : The_garage) {
			somme_km += auto.getKilometrage();
		}
		return somme_km / The_garage.length;
	}

	public int f9()
	{
		return 0;
	}

	public int f10(int n, int k)
	{
		return 0;
	}

}
