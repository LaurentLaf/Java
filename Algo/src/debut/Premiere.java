package debut;

public class Premiere {

	//Il n'y a qu'une seule partie main qui contiendra tous les appels de fonction
	public static void main(String[] args) {

		/*//0// Utilisation de la fonction factorielle*/
		/*for (int i = 1; i <= 10; i++) {
			System.out.println("##########################################################");
			System.out.println("Factoriel de "+ i +" : " + factoriel(i));
			System.out.println("##########################################################");
		}*/

		//1// System.out.println(SommeNPremierNombresRecT(4));
				
		//2// System.out.println(SommeNPremierNombresRec(5));
		
		//3//TesterSommeNPremierNombresRec();
	}



	//Toutes les fonctions se doivent d'être définies en dehors du main
	
	//0// Fonction factoriel
	public static int factoriel(int n) {
		System.out.println("Début Factorielle n : "+n);
		int f = 1;
		if ((n!=1) && (n!=0)) {
			System.out.println("Avant appel récursif n : "+n+" et f : "+f);
			f = n*factoriel(n-1);
			System.out.println("Après appel récursif n : "+n+" et f : "+f);
		}
		System.out.println("Fin Factorielle f : "+f);
		return f;
	}
	
	//1// Fonction SommeNPremierNombresRec en récursive terminale
	private static int SommeNPremierNombresRecT(int i) {
		return SommeAux(i,0);
	}

	private static int SommeAux(int i, int j) {
		if (i > 0) {
			return SommeAux(i - 1, j + i);
		}
		return j;
	}
	
	//2// SommeNPremierNombresRec en récursive normale
	private static int SommeNPremierNombresRec(int i) {
		int Som = 0;
		if (i >= 0) {
			if (i != 0) {
				Som = i + SommeNPremierNombresRec(i - 1);
			}
			
		}
		return Som;
	}
	
	//3// Fonction de test pour la fonction SommeNPremierNombresRec()
	private static void TesterSommeNPremierNombresRec() {
		int n = 10;
		int somme=SommeNPremierNombresRec(n);
		if (somme==55) {
			System.out.println("OK");}
		else {
			System.out.println("BUG");}
		
		n = 0;
		somme=SommeNPremierNombresRec(n);
		if (somme==0) {
			System.out.println("OK");}
		else {
			System.out.println("BUG");}
		
		n = -10;
		somme=SommeNPremierNombresRec(n);
		if (somme==0) {
			System.out.println("OK");}
		else {
			System.out.println("BUG");}
	}
	
	//4// SommeNEntier
		public static int SommeNEntier(int n) {
			int res = 0;
			
			if (n > 0) {
				res = n + SommeNEntier(n - 1);
			}

			return res;
		}
}