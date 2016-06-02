import java.util.ArrayList;

public class test {
	private static int[] desEntiers2 = {200,300,400};
	
	public static void main(String[] args) {
		//int[] desEntiers2 = {60,50,40};
		/*test test = new test();
		test.afficherTroisTableaux();
		test test1 = new test();
		test1.afficherTroisTableaux();
		*/
	}
	
	private void afficherTroisTableaux() {
		final int[] desEntiers1 = {10,20,30};
		int[] desEntiers3 = desEntiers2;
		
		for (int i = 0; i < desEntiers2.length; i++) {
		System.out.println("niveau "+i+": "+desEntiers1[i]+" - "+desEntiers2[i]+" - "+desEntiers3[i]);
		}
		System.out.println("--------------------------------------");
		desEntiers1[0]++; desEntiers2[1]++; desEntiers3[2]++;
		for (int i = 0; i < desEntiers2.length; i++) {
		System.out.println("niveau "+i+": "+desEntiers1[i]+" - "+desEntiers2[i]+" - "+desEntiers3[i]);
		}
		System.out.println("--------------------------------------");
		}
}
