package messtats;

public class Releve {
	private String mois;
	private int jour;
	private int temperature;
	private int pluviometrie;
	private int vent;

	Releve(String vmois, int vjour, int vt, int vp, int vv){
		this.mois = vmois;
		this.jour = vjour;
		this.temperature = vt;
		this.pluviometrie = vp;
		this.vent = vv;
	}

	String getMois() {
		return this.mois;
	}

	int getJour() {
		return this.jour;
	}

	int getTemp() {
		return this.temperature;
	}

	int getPluvio() {
		return this.pluviometrie;
	}

	int getVent() {
		return this.vent;
	}

	void afficher()
	{System.out.println("Relev� du "+jour+" "+mois+" : temp�rature = "+temperature+", pluviom�trie = "+pluviometrie+", vent = "+vent);}

}
