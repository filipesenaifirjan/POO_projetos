package automoveis;
import java.util.Scanner;
public class SimuladorDeVelocidade {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo informações do veículo ao usuário
        System.out.print("Informe a potência do motor do veículo (em cavalos): ");
        double potencia = scanner.nextDouble();
        System.out.print("Informe o tipo de combustível (gasolina ou etanol): ");
        String combustivel = scanner.next();
        System.out.print("Informe a carga do veículo (em quilos): ");
        double carga = scanner.nextDouble();
        System.out.print("Informe o número de passageiros no veículo (até 5): ");
        int passageiros = scanner.nextInt();
        System.out.print("O veículo vai subir alguma serra? (S/N): ");
        String serra = scanner.next();
        double perdaVelocidade = 0;
        if (serra.equalsIgnoreCase("S")) {
            perdaVelocidade = 0.2;
        }
        
        // Calculando a velocidade máxima do veículo com as informações fornecidas
        double velocidadeMaxima = 0;
        if (combustivel.equalsIgnoreCase("gasolina")) {
            velocidadeMaxima = Math.sqrt(potencia * 2.5 / (carga + passageiros * 80)) * 3.6;
        } else if (combustivel.equalsIgnoreCase("etanol")) {
            velocidadeMaxima = Math.sqrt(potencia * 2 / (carga + passageiros * 80)) * 3.6 * 0.7;
        } else {
            System.out.println("Combustível inválido!");
            System.exit(0);
        }
        
        // Aplicando as perdas de potência e velocidade de acordo com a carga e a serra
        double perdaPotencia = carga / 500;
        double perdaVelocidadeCarga = carga / 200;
        velocidadeMaxima *= Math.pow(0.9, passageiros) * (1 - perdaPotencia) * (1 - perdaVelocidade + perdaVelocidadeCarga);
        
        
        System.out.println("A velocidade máxima do veículo é de " + Math.round(velocidadeMaxima) + " km/h.");
        scanner.close();
    }
}