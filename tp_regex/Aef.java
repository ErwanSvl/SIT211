

public abstract class Aef {

	private int etat;
	public abstract boolean accepte(String input);
	private int transition (int EtatCourant, char symboleLu);
	private boolean isTerminal(int etat);
	private int initial();
}
