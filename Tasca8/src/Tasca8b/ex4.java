package Tasca8b;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		boolean longitut = false;
		int l = 0;
		while (!longitut) {
			System.out.print("Digues cuants numeros vols entrar [0 - 100]: ");
			l = in.nextInt();
			if (l > 0 && l < 101) {
				longitut = true;
			} 
		}	
		int[] matrix = new int[101];
		for(int i = 0; i < l; i++) {
			System.out.println("Entra el " + (i + 1) + " numero:");
			int n = in.nextInt();
			matrix[n] = matrix[n] + 1;	
		}
		System.out.println(" Resultat ");
		for (int i = 0; i < l; i++) {
			if (matrix[i] !=0) {
				System.out.println(i + " Apareix " + matrix[i] + " vegades.");
			}
		}
		in.close();	
	}

}
