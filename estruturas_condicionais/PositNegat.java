package estruturas_condicionais;

import java.util.Scanner;

public class PositNegat {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite um número, podendo ser negativo ou positivo: ");
	double x = scan.nextDouble();
	
	if (x < 0) {
	System.out.println("O número digitado é NEGATIVO.");	
	}

	            if (x == 0) {
	System.out.println("O número digitado é um número neutro, é 0.");	
	   }
	else {
	System.out.println("O número digitado é um número POSITIVO.");
	}
		
	scan.close();
	}
}