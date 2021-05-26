
import java.util.Scanner;

public class Senha {

	 public static void main(String Args[] ) {
		 Scanner scan = new Scanner(System.in);
		 int senha = scan.nextInt();
		 
		 while (senha != 2002) {
			 
			 System.out.println("Senha invalida");
			 senha = scan.nextInt();
			
		 }
		 System.out.println("Senha Correta");
		 scan.close();
	 }
	
	
}
