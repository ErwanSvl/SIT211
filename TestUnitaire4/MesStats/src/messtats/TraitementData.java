
package messtats;

public class TraitementData {
	private int valeurMaximum;
	private int valeurMinimum;
	private int nombreValeurs;
	private int sommeValeurs;

	TraitementData() {
		this.valeurMaximum = -100;
		this.valeurMinimum = 2000;
		this.nombreValeurs = 0;
		this.sommeValeurs = 0;
	}

	public int getMaximum() { 
		return this.valeurMaximum;
	}

	public int getMinimum() {
		return this.valeurMinimum;
	}

	public int getNbVal() {
		return this.nombreValeurs;
	}

	public int getSomme() {
		return this.sommeValeurs;
	}

	public void majMaximum(int m){
		if(m > this.valeurMaximum ) {			
			this.valeurMaximum = m;
		}
	}

	public void majMinimum(int m) {
		if (m < this.valeurMinimum) {			
			this.valeurMinimum = m;
		}
	}

	public void incNbVal() {
		this.nombreValeurs++;
	}

	public void majSomme(int v)	{
		this.sommeValeurs += v;
	}

	public float moyenne() {
		if(this.nombreValeurs == 0) {
			return 0;
		} else {			
			return (float) this.sommeValeurs/this.nombreValeurs;
		}
	}

	public void afficher()
	{
		float moyenne = moyenne();
		System.out.println("Max = "+valeurMaximum+", Min = "+valeurMinimum+", Nb = "+nombreValeurs+", Somme = "+sommeValeurs+", Moyenne = "+moyenne);
	}

}
