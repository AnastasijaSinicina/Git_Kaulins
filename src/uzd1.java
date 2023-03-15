import java.util.Random;
import java.util.Scanner;

public class uzd1 {
	public static void main(String[]args){
		int sk, reiz;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes mest kaulinu? ");
		reiz = scan.nextInt();
		for(int i=1; i<=reiz; i++){
			sk = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis "+sk);
		}
		scan.close();
	}

}
