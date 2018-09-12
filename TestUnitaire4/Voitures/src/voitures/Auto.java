package voitures;

public class Auto {
	private String marque;
	private String modele;
	private float prix;
	private float consommation;
	private int kilometrage;
	private int nb_portes;
	private int nb_places;

	Auto(String vmarque, String vmodele, 
			float vprix, float vconsommation, 
			int vkilometrage, int vnb_portes, int vnb_places)
	{	
		this.marque = vmarque;
		this.modele = vmodele;
		this.prix = vprix;
		this.consommation = vconsommation;
		this.kilometrage = vkilometrage;
		this.nb_portes = vnb_portes;
		this.nb_places = vnb_places;
	}

	public String getModele()
	{
		// renvoie le mod�le de l'Auto courante
		return this.modele;
	}

	public String getMarque()
	{
		// renvoie la marque de l'Auto courante
		return this.marque;
	}

	public float getPrix()
	{
		// renvoie le prix de l'Auto courante
		return this.prix;
	}

	public float getConso()
	{
		// renvoie la consommation de l'Auto courante
		return this.consommation;
	}
	
	public int getKilometrage()
	{
		// renvoie le kilom�trage de l'Auto courante
		return this.kilometrage;
	}

	public int getNbPortes()
	{
		// renvoie le nombre de portes de l'Auto courante
		return this.nb_portes;
	}

	public int getNbPlaces()
	{
		// renvoie le nombre de places de l'Auto courante
		return this.nb_places;
	}
	
	public void afficher()
	{
		System.out.println("      Marque : "+this.getMarque());
		System.out.println("      Modele : "+this.getModele());
		System.out.println("      Prix : "+this.getPrix());
		System.out.println("      Consommation : "+this.getConso());
		System.out.println("      Kilometrage : "+this.getKilometrage());
		System.out.println("      Nombre de Portes : "+this.getNbPortes());
		System.out.println("      Nombre de Places : "+this.getNbPlaces());
	}
}
