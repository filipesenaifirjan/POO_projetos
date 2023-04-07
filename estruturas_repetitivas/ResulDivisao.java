package estruturas_repetitivas;

import java.util.Scanner;

public class ResulDivisao {

	public static void main(String[] args) {

	Scanner scan = new Scanner (System.in);
	
	System.out.println("Digite quantas vezes deseja fazer a operação: ");
	int repeticoes = scan.nextInt();
	
	for (int i=0; i < repeticoes; i++) {
		System.out.println("Digite o primeiro número: ");
		int x = scan.nextInt();

		System.out.println("Digite o segundo número: ");
		int y = scan.nextInt();
		
			if (y == 0) { 
				System.out.println("Divisão Impossível.");
			}
			else {
				double resultado = (double) x / y; //por que entra esse (double)? ele altera o resultado.
				System.out.printf("Resultado da Divisão: %.1f%n", resultado);
			}
	}
	
	scan.close();	

	}

}