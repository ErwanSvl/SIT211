package voitures;

public class Main {

	public static void main(String[] args) { 
		Garage garage ;
		Auto une_auto;
		
	    garage = new Garage(10);
	    une_auto = new Auto("Renault", "Twizy", (float)6490, (float)4.5, 4700, 2, 2);
	    garage.ajouter(une_auto);
	    une_auto = new Auto("Jeep", "Compass", (float)11990, (float)8, 94000, 3, 5);
	    garage.ajouter(une_auto);
	    une_auto = new Auto("Opel", "Insignia", (float)16490, (float)6.5, 69800, 5, 5);
	    garage.ajouter(une_auto);
	    une_auto = new Auto("Opel", "Mokka", (float)18990, (float)6, 24450, 3, 5);
	    garage.ajouter(une_auto);
	    une_auto = new Auto("Peugeot", "3008", (float)14490, (float)7, 96416, 5, 6);
	    garage.ajouter(une_auto);
	   
	    garage.afficher();
	    menu(garage);  
	}	
	
	static void menu(Garage g)
	{
		int res;
		float res2;
		boolean res3;
	
		System.out.println("----------- Menu -------------");
		System.out.println("   Choix 1"); // f1
		System.out.println("   Choix 2"); // f2 	   
	    System.out.println("   Choix 3"); // f3
	    System.out.println("   Choix 4"); // f4
		System.out.println("   Choix 5"); // f5
		System.out.println("   Choix 6"); // f6    
	    System.out.println("   Choix 7"); // f7   
	    System.out.println("   Choix 8"); // f8
		System.out.println("   Choix 9"); // f9
		System.out.println("   Choix 10"); // f10
	    System.out.println("-----------------------------");
	    
	    for(int c=1;c<11;c++)
	    	switch (c) {
	    		case 1: res=g.f1("Renault"); System.out.println("f1 : "+res); break; 
	    		case 2: res=g.f2("3008"); System.out.println("f2 : "+res); break; 
	    		case 3: res=g.f3(); System.out.println("f3 : "+res); break; 
	    		case 4: res3=g.f4(); System.out.println("f4 : "+res3); break; 
	    		case 5: res=g.f5(); System.out.println("f5 : "+res); break; 
	    		case 6: res=g.f6(); System.out.println("f6 : "+res); break; 
	    		case 7: res2=g.f7(); System.out.println("f7 : "+res2); break; 
	    		case 8: res=g.f8(); System.out.println("f8 : "+res); break; 
	    		case 9: res=g.f9(); System.out.println("f9 : "+res); break; 
	    		case 10: res=g.f10(3,10000); System.out.println("f10 : "+res); break;
	    		default: System.out.println("Erreur");             
	    	}
	    
	    System.out.println("-----------------------------");
	    System.out.println("Fin du programme");
	}
	
}
