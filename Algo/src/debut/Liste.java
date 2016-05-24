package debut;

import java.util.ArrayList;

public class Liste {

	public static void main(String[] args) {
		//System.out.println(estVide(initListe1()));
		//System.out.println(estVide(initListe2()));
		//System.out.println(estVide(listeVide()));
		//System.out.println(suite(initListe1()));
		//System.out.println(suite(listeVide()));
		//System.out.println(premier(initListe1()));
		//System.out.println(premier(initListe2()));
		//System.out.println(premier(listeVide()));
		System.out.println(estSurLeDernierElement(initListe1()));
		System.out.println(estSurLeDernierElement(initListe2()));
		System.out.println(estSurLeDernierElement(initListe3()));

	}

	// Fonction d'initialisation de la liste1
	public static ArrayList<String> initListe1() {
		ArrayList<String> liste = new ArrayList<String>(5);
		
		liste.add("Coucou");
		liste.add("le");
		liste.add("monde");

		return liste;
	}

	// Fonction d'initialisation de la liste2
	public static ArrayList<String> initListe2() {
		ArrayList<String> liste = new ArrayList<String>(5);
		
		liste.add("le");
		liste.add("monde");

		return liste;
	}

	// Fonction d'initialisation de la liste3
	public static ArrayList<String> initListe3() {
		ArrayList<String> liste = new ArrayList<String>(5);
		
		liste.add("monde");

		return liste;
	}
	
	// Fonction d'initialisation de la listeVide
	public static ArrayList<String> listeVide() {
		ArrayList<String> liste = new ArrayList<String>(1);
		return liste;
	}

	/** 
	 * Fonction estVide(liste) : liste -> booléen
	 * 
	 * @param i : liste à tester
	 * @return  : vrai - le tableau est vide
	 * 			  faux - le tableau n'est pas vide
	 * 
	 */
	//Version ancienne
	/*public static boolean estVide(ArrayList<Integer> i) { 
		return i.size()==0;
	}*/ 
	public static boolean estVide(ArrayList<String> i) { 
		return i.size()==0;
	}

	/**
	 *  Fonction premier(liste) : liste -> entier (le premier de la liste)
	 *  
	 * @param i : liste à tester
	 * @return  : le premier élément de la liste
	 * 
	 */
	public static String premier(ArrayList<String> i) {
		String rep = null;
		if (!estVide(i)) {
			rep = premier(i);
		}
		return rep;
	}

	/**
	 * Fonction suite(liste) : liste -> liste (renvoie la liste sans le premier élément)
	 * 
	 * @param i : liste à traiter
	 * @return  : liste sans le premier caractère
	 * 
	 */
	//Version ancienne
	/*public static ArrayList<Integer> suite(ArrayList<Integer> i) {
		if (estVide(i)==false) {
			i.remove(0);
		}
		return i;
	}*/
	public static ArrayList<String> suite(ArrayList<String> liste) {
		ArrayList<String> rep = null;
		if (!estVide(liste)) {
			rep = liste;
			rep.remove(0);
		}
		return rep;
	}
	
	/*public static ArrayList<String> suite(ArrayList<String> i) {
		// TODO A corriger
		if (estVide(i)==false) {
			i.remove(0);
		}
		return i;
	}*/
	
	public static boolean estSurLeDernierElement(ArrayList<String> liste) {
		return !estVide(liste) && estVide(suite(liste));
	}

}
