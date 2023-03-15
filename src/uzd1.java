import java.util.Random;

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
}
