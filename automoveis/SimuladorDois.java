package automoveis;
import java.util.Scanner;


public class SimuladorDois {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o valor atual da gasolina?");
        double valorGasolina = input.nextDouble();
        System.out.println("Qual o valor atual do etanol?");
        double valorEtanol = input.nextDouble();

        System.out.println("Seu carro é 1.0, 1.6 ou 2.0?");
        double consumo = 0;
        int tipoCarro = input.nextInt();
        switch(tipoCarro){
            case 1:
                consumo = 16;
                break;
            case 16:
                consumo = 10;
                break;
            case 20:
                consumo = 7;
                break;
            default:
                System.out.println("Tipo de carro inválido");
                System.exit(0);
        }

        double valorKmGasolina = valorGasolina / consumo;
        double valorKmEtanol = valorEtanol / (consumo * 1.3);

        if (valorKmEtanol <= valorKmGasolina) {
            System.out.println("Abasteça com Etanol");
        } else {
            System.out.println("Abasteça com Gasolina");
        }
    }
}