import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Kaulins {
	static void mestKaulinu(int reizes) {
		int skaitlis, lielak=0;
		Random rand = new Random();
		for(int i=1; i<=reizes; i++) {
			skaitlis = rand.nextInt(6)+1;	
			System.out.println("Uzkrita skaitlis "+skaitlis);
			if(lielak<skaitlis) {
				lielak = skaitlis;
			}			
		}
		System.out.println("Lielakais skaitlis "+lielak);
	}
		public static void main(String[] args) {
		int reizes;
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("Cik reizes mest kauliòu?");
		reizes = scan.nextInt();
		}while(reizes<1);
		mestKaulinu(reizes);
		scan.close();
	}
}
