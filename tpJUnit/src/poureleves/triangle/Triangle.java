package poureleves.triangle;

/**
 * La classe <code>Triangle</code> construit un objet triangle sur la base d'un triplet d'entiers
 * censes representer la longueur de ses cotes. Elle leve une exception si ce triplet est
 * incompatible avec la definition d'un triangle.<br />
 * NB : concernant les cas limites, la convention choisie est qu'un triangle peut se limiter a un
 * simple point (3 cotes de longueur nulle).
 * <p>
 * La classe offre plusieurs methodes destinees a caracteriser le triangle : isocele, equilateral,
 * rectangle.
 * 
 * @author G. Ouvradou
 * @author E. Cousin
 */
public class Triangle {

	/** Les longueurs respectives des cotes du triangle (entiers) */
	private final int cote1, cote2, cote3;

	/**
	 * le constructeur prend en argument les valeurs respectives des cotes du triangle
	 * 
	 * @param a la longueur d'un des 3 cotes du triangle
	 * @param b la longueur d'un des 3 cotes du triangle
	 * @param c la longueur d'un des 3 cotes du triangle
	 * @throws TriangleInvalide triplet d'entiers passe en argument incompatible avec le concept de
	 *           triangle
	 */
	public Triangle(int a, int b, int c) throws TriangleInvalide {
		if (!estUnTriangle(a, b, c))
			throw new TriangleInvalide();
		this.cote1 = a;
		this.cote2 = b;
		this.cote3 = c;
	}

	/** @return vrai si le triangle est equilateral */
	public boolean estEquilateral() {
		return this.cote1 == this.cote2 && this.cote1 == this.cote3;
	}

	/** @return vrai si le triangle est isocele */
	public boolean estIsocele() {
		return this.cote1 == this.cote2 || this.cote1 == this.cote3 || this.cote2 == this.cote3;
	}

	/** @return vrai si le triangle est rectangle */
	public boolean estRectangle() {
		return this.cote1 * this.cote1 == this.cote2 * this.cote2 + this.cote3 * this.cote3
				|| this.cote3 * this.cote3 == this.cote1 * this.cote1 + this.cote2 * this.cote2
				|| this.cote2 * this.cote2 == this.cote1 * this.cote1 + this.cote3 * this.cote3;
	}

	/**
	 * Rend une chaine de caracteres decrivant le triangle : longueur des cotes + proprietes
	 * particulieres
	 */
	@Override
	public String toString() {
		String leTriangle = "Triangle";
		leTriangle += "[" + this.cote1 + ", " + this.cote2 + ", " + this.cote3 + "]";

		return leTriangle;
	}

	/**
	 * Permet de tester un triplet d'entiers a priori
	 * 
	 * @return vrai si le triplet d'entier passe en argument est compatible avec la definition d'un
	 *         triangle
	 */
	public static boolean estUnTriangle(int cote1, int cote2, int cote3) {
		return cote1 >= 0 && cote2 >= 0 && cote3 >= 0
				&& plusGrandplusPetitqueLaSomme(cote1, cote2, cote3);
	}

	public static void main(String[] args) {
		System.out.println("Verification sommaire de la classe Triangle ");
		System.out.print("Triangle(5,2,1): ");
		if (!estUnTriangle(5, 2, 1))
			System.out.println("INVALIDE => TEST CORRECT");
		else
			System.out.println("VALIDE => TEST EN DEFAUT");
		System.out.print("Triangle(2,3,1) : ");
		if (estUnTriangle(2, 3, 1))
			System.out.println("VALIDE => TEST CORRECT");
		else
			System.out.println("INVALIDE => TEST EN DEFAUT");
	}

	// petit test unitaire de la methode estUnTriangle(..)

	/**
	 * @return vrai si le plus grand element du triplet passe en argument est inferieur non
	 *         strictement (NB : entiers) a la somme des deux autres
	 */
	private static boolean plusGrandplusPetitqueLaSomme(int a, int b, int c) {
		if (a >= b && a >= c) // a est le plus grand cote
			return a <= b + c;
		else if (b >= a && b >= c) // b est le plus grand cote
			return b <= a + c;
		else
			// c est le plus grand cote
			return c <= a + b;
	}
}
