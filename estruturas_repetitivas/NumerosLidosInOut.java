package estruturas_repetitivas;
import java.util.Scanner;

public class NumerosLidosInOut {
    
        public static void main(String[] args) {
        
            Scanner scan = new Scanner(System.in);
        
        int numerosLidos = 0;
        
        int in = 0;
        int out = 0;
        
        System.out.println("Quantos números serão lidos agora? ");
        int repeticoes = scan.nextInt();
        
        for (int i=1; i <= repeticoes; i++) { //se começar com "i=0", vai contar uma vez a mais, 3x e não 2x, por exemplo.
            System.out.println("Digite um número: ");
            numerosLidos = scan.nextInt();
        
                if (10 >= numerosLidos || numerosLidos <= 20) {
                    in = in + 1;
                }
                else {
                    out = out + 1;
                }
        }
        
            System.out.println("Quantidade de Números In: " + in);
            System.out.println("Quantidade de Números Out: " + out);
        
        scan.close();
    
        }
    
    }
