package estruturas_condicionais;

import java.util.Scanner;

public class DuracaoJogo {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Qual o horário do início do jogo, em número inteiro?");
		int horaInicial = scan.nextInt();
	
	System.out.println("Qual o horário do fim do jogo, em número inteiro?");
		int horaFinal = scan.nextInt();
	
	int duracaoJogo = 24;
	
	  if (horaInicial > horaFinal) {
		duracaoJogo = (24 - horaInicial + horaFinal);
	}
		
	else if   (horaInicial < horaFinal) {
		duracaoJogo = (horaFinal - horaInicial);
	}
			
	System.out.println("O jogo durou " + duracaoJogo + " hora(s).");
	
	scan.close();
	}
}