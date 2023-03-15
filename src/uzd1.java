import java.util.Random;
<<<<<<< HEAD
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

=======

public class uzd1 {
static void mestKaulinu(int reizes){
	int sk;
	Random rand = new Random();
	for(int i=1; i<=reizes; i++){
	sk = rand.nextInt(6)+1;
	System.out.println("Uzkrita skaitlis "+sk);
	}
}
public static void main(String[]args){
	mestKaulinu(3);
}
>>>>>>> AnastasijasZars
}
