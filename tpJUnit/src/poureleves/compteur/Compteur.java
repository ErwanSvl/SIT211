package poureleves.compteur;

public class Compteur {
	private int val;

	public Compteur(int a) throws CompteurInvalide {
		if (a < 0)
			throw new CompteurInvalide();
		else
			this.val = a;
	}

	public void ajouterVal(int a) {
		this.val = this.val + a;
	}

	public int getVal() {
		return this.val;
	}
}
