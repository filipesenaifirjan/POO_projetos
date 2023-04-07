package estruturas_repetitivas;


import java.util.Scanner;



public class DoWhileAulaUm {
    
    public static void main(String[] args) {

       
         Scanner sc = new Scanner (System.in);
        
        char resposta;
        
        do {
                System.out.println("Digite a temperatura em Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
            //irei declarar a variável aqui, porque fora será necessário fornecer um valor, aqui será preenchido pelo usuário ok?
        
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
            System.out.println("Deseja repetir (s/n)?");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');
        
        sc.close();
        
        }
    }
