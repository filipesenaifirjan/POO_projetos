package outros_exemplos;
import java.util.Scanner; 
public class FranquiaCelular {
    public static void main(String[] args) {
	
        Scanner scan = new Scanner (System.in);
    
        System.out.println("Quantos minutos da franquia foram utilizados?");
        int minutosConsumo = scan.nextInt();
        double excedente;
        
        if (minutosConsumo <= 40) {
            System.out.println("Valor a Pagar: R$ 50,00");
        }
        else if (minutosConsumo > 40) {
            excedente = ((minutosConsumo - 40) * 2) + 50;
            
          
            System.out.printf("Valor a Pagar: R$ %.2f %n", excedente);
        }
        
        scan.close();
        }
}
