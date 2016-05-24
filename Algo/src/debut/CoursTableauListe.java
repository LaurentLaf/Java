package debut;

import java.util.ArrayList;

public class CoursTableauListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tabletteDeChocolat();
		listeDeChocolats();
	}
	
	// Cours sur les listes
	private static void listeDeChocolats() {
		ArrayList<Integer> boite = new ArrayList<Integer>(5);
		
		boite.add(3);boite.add(-3); //Autoboxing
		boite.add(new Integer(8));boite.add(new Integer(1)); //Ajout de valeur normalement
		
		
		System.out.println(boite.size());
		
		//Solution d'affichage : utilisation d'une boucle for
		Integer chocolat = null;
		for (int i = 0; i < boite.size(); i++) {
			chocolat = boite.get(i);
			//System.out.println(chocolat);
		}
		
		//Solution d'affichage : Notation java 5 du foreach
		/*for (Integer chocolat2 : boite) {
			System.out.println(chocolat2);
		}*/
	}
	
	// Cours sur les tableaux
	private static void tabletteDeChocolat() {
		
		int[] tablette = {3,6,9,2,5,8};
		
		int[] tablette2 = new int[5];
		tablette2[0]=12;
		tablette2[1]=3;
		//Affichage de la valeur à l'indice 0 du tableau tablette2[]
		System.out.println(tablette2[0]);
		
		//Parcours d'un tableau d' "int" en définissant une variable int avec boucle for
		int ligne1;
		for (int i = 0; i < tablette2.length; i++) {
			ligne1 = tablette2[i];
			System.out.println(ligne1);
		}
		
		//Parcours du tableau tablette2 avec la notation java
		for (int ligne : tablette2) {
			System.out.println(ligne);
		}
	}
}
