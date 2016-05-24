package debut;

public class Produit {

	public static void main(String[] args) {
		//System.out.println(ProduitN1N2Rec(-2,3));
		//System.out.println(ProduitN1N2Rec(2,-3));
		//System.out.println(ProduitN1N2Rec(2,3));
		//System.out.println(ProduitN1N2Rec(0,3));
		//System.out.println(ProduitN1N2Rec(0,-3));
		System.out.println(ProduitN1N2RecT(-2,3));
		System.out.println(ProduitN1N2RecT(2,-3));
		System.out.println(ProduitN1N2RecT(2,3));
		System.out.println(ProduitN1N2RecT(0,3));
		System.out.println(ProduitN1N2RecT(0,-3));
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Question 5 Rec : Faire le produit de deux nombres en n'utilisant que l'addition, sans multiplication.
	private static int ProduitN1N2Rec(int i, int j) {
		int Pdt = 0;
		int signe = 1;
		if ((i == 0) || (j == 0)) {
			return Pdt;
		}

		if (((i < 0) && (j > 0)) || ((i > 0) && (j < 0))) {
			signe = -signe;
			//System.out.println(signe);
		}

		i = Math.abs(i);
		j = Math.abs(j);

		Pdt = i + ProduitN1N2Rec(i, j - 1);

		return Pdt * signe;
	}
	
	/////////////////////////////
	//Version récursive terminale
	private static int ProduitN1N2RecT(int i, int j) {
		int Pdt = 0;
		int signe = 1;
		// Condition d'arrêt : si l'un des deux argument est null : Pdt -> 0
		if ((i == 0) || (j == 0)) {
			return Pdt;
		}

		// Condition de signe : si l'un des deux argument est négatif : Pdt -> négatif
		if (((i < 0) && (j > 0)) || ((i > 0) && (j < 0))) {
			signe = -signe;
		}

		//Utilisation de la valeur absolue pour faire les calculs
		i = Math.abs(i);
		j = Math.abs(j);

		//Utilisation de la fonction auxiliaire pour faire les calculs
		Pdt = ProduitN1N2RecAux(i,j,0);

		//On retourne finalement le résultat du calcul et on applique le signe
		return Pdt * signe;
	}
	
	//Fonction auxiliaire ProduitN1N2RecAux(int i, int j, int res)
	private static int ProduitN1N2RecAux(int i, int j, int res) {
		//Si le deuxième argument vaut 1, on ajoute i au résultat et on renvoie le résultat
		if (j == 1) {
			res += i;
		}
		//Sinon on décrémente j de 1 et on ajoute 1 au résultat avant de recommencer la fonction.
		else {
			res = ProduitN1N2RecAux(i, j - 1, res + i);
		}
		return res;

	}
}
