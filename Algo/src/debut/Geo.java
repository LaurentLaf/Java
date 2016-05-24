package debut;

import javax.sound.sampled.Line;

public class Geo {

	public static void main(String[] args) {
		//NEtoileLigne(10);
		//System.out.println(RetournerLigne());
		//RetourChariot();
		//afficheCaracteres(2, "k");
		//System.out.println(retourneCaracteres(3, "M"));
		//retourneTrait(1);
		//System.out.println(retourneLigne());
		//triangleNHB(8);
		//System.out.println(retourneLigne(8));
		//triangleNBH(8);
		
	}

	/////////////////////////////////////////////////////////
	// Question 1 : Faire une procédure qui affiche n étoiles
	public static void NEtoileLigne(int i) {
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
	}
	
	// Question 1 : Version récursive
	public static void NEtoileLigneRec(int i) {
		if (i!=0) {
			System.out.print("*");
			NEtoileLigneRec(i - 1);
		}
	}
	
	///////////////////////////////////////////////////////////
	// Question 2 : Faire une fonction qui retourne cette ligne
	public static String RetournerLigne() {
		return NEtoileLigne1(10);
	}

	public static String NEtoileLigne1(int i) {
		String ligne = "";
		for (int j = 0; j < i; j++) {
			ligne += "*";
		}
		return ligne;
	}
	
	/////////////////////////////////////////////////////
	// Question 3 : Faire une procédure qui va à la ligne

	public static void RetourChariot() {
		System.out.println("");
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Question 4 : Faire une procédure afficheCaractere() qui affiche n fois un caractère particulier sur une ligne.
	
	public static void afficheCaracteres(int i, String j) {
		for (int k = 0; k < i; k++) {
			System.out.print(j);
		}
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Question 5 : Faire une fonction retourneCaracteres() qui retourne n fois un caractère particulier sur une ligne.
	
	public static String retourneCaracteres(int i, String j) {
		String ligne = "";
		for (int k = 0; k < i; k++) {
			ligne += j;
		}
		return ligne;
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Question 6a : Faire une fonction(plutot procédure) retournerTrait( xxxx ) qui affiche n étoiles sur une ligne en utilisant  retourneCaracteres
	
	public static String retourneTrait(int i) {
		return retourneCaracteres(i, "*");
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Question 6b : Faire une fonction retournerLigne( xxxx ) qui utilise retournerTrait puis va à la ligne. 
	// 			    On utilisera ensuite souvent cette fonction.
	
	public static String retourneLigne(int i) {
		String ligne = retourneTrait(i) + "\n";
		return ligne;
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Question 7 : Faire une boucle (for) qui permet d'afficher un triangle de hauteur 8. (du haut vers le bas)
	
	public static void triangleNHB(int i) {
		String ligne = "";
		for (int k = 1; k <= i; k++) {
			ligne += retourneLigne(k);
		}
		System.out.println(ligne);
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Question 7b : Faire une boucle (for) qui permet d'afficher un triangle de hauteur 8. (du bas vers le haut)
	
	public static void triangleNBH(int i) {
		String ligne = "";
		for (int k = i; k > 0; k--) {
			ligne += retourneLigne(k);
		}
		System.out.println(ligne);
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Question 8 : Faire une fonction qui retourne un triangle de hauteur n
	
	public static String retourneTriangleN(int i) {
		String ligne = "";
		for (int k = 1; k <= i; k++) {
			ligne += retourneLigne(k);
		}
		return ligne;
	}
	
	
}
