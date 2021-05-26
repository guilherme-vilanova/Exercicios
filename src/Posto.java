import java.util.Scanner;

public class Posto {
	
	public static void main(String Args[] ) {
		 Scanner scan = new Scanner(System.in);
		 int leitura = scan.nextInt();
		 int CA = 0;
		 int CG = 0;
		 int CD = 0;
		 
		 while (leitura > 4) {
			 System.out.println("Digite um valor valido");
			 leitura = scan.nextInt();
		 }
		
		 while (leitura != 4) {
		 
		 if (leitura == 1) {			 
			 CA = CA + 1;	
		 }
		 else if (leitura == 2) {			 
			 CG = CG + 1;			 
		 }
		 else if (leitura == 3){			 
			 CD = CD + 1;			 
		 }	 
		 leitura = scan.nextInt();
		 
		 }
		 System.out.println("MUITO OBRIGADO");
		 System.out.println("Alcool: " + CA);
		 System.out.println("Gasolina: "+ CG);
		 System.out.println("Diesel: " + CD);
		 scan.close();
	}
		 
		
	}



