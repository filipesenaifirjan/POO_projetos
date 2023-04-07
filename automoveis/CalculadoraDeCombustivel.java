package automoveis;
import java.util.Scanner;
public class CalculadoraDeCombustivel {
    




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o preço da gasolina: ");
        double precoGasolina = scanner.nextDouble();
        
        System.out.print("Digite o preço do etanol: ");
        double precoEtanol = scanner.nextDouble();
        
        System.out.print("Digite o consumo de gasolina (km/l): ");
        double consumoGasolina = scanner.nextDouble();
        
        double consumoEtanol = consumoGasolina * 1.3; // Etanol consome 30% a mais
        
        System.out.println("\nValores informados:");
        System.out.printf("Preço da gasolina: R$ %.2f\n", precoGasolina);
        System.out.printf("Preço do etanol: R$ %.2f\n", precoEtanol);
        System.out.printf("Consumo de gasolina: %.2f km/l\n", consumoGasolina);
        System.out.printf("Consumo de etanol: %.2f km/l\n", consumoEtanol);
        
        double rendimentoGasolina = precoGasolina / consumoGasolina;
        double rendimentoEtanol = precoEtanol / consumoEtanol;
        
        if (rendimentoGasolina <= rendimentoEtanol) {
            System.out.println("\nVale mais a pena utilizar ETANOL!");
        } else {
            System.out.println("\nVale mais a pena utilizar GASOLINA!");
        }
        
        scanner.close();
    }
}