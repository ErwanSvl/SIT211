package messtats;

public class Pluviometrie extends TraitementData {
	private int constanteCrue = 100;
	private int constanteSecheresse = 10;

	@Override
	public void majMaximum(int m)
	{
		super.majMaximum(m);
		if (m>=constanteCrue) System.out.println("!!!!!!!!!!!!!!!!!!!!!!!! Alerte crue !");
	}

	@Override
	public void majMinimum(int m)
	{
		super.majMinimum(m);
		if (m<=constanteSecheresse) System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!! Alerte secheresse !");
	}

	@Override
	public void afficher()
	{
		System.out.print("-----> Traitement Pluvio : ");
		super.afficher();
	}
}
