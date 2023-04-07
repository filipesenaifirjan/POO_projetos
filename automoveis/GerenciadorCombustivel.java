package automoveis;

import java.util.Scanner;

public class GerenciadorCombustivel {//aqui ele vai dizer quanto vc anda com o combustivel que vc coloca levando em conta que ele consome 30% a mais com alcool e 1% menos com gasolina aditivada
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      double consumoGasolina = 10; // consumo médio do veículo com gasolina em km/l
      double combustivel = 0;
      double distancia = 0;
      String tipoCombustivel;

      try {
         System.out.println("Escolha o tipo de combustível (G para gasolina comum, A para gasolina aditivada ou E para etanol): ");
         tipoCombustivel = scan.nextLine().toUpperCase();

           if (tipoCombustivel.equals("G")) {
          
            consumoGasolina = 10;
         } else if (tipoCombustivel.equals("A")) {
            // se escolher gasolina aditivada, subtrair 1% do consumo médio padrão
            consumoGasolina = 10 - (10 * 0.01);
         } else if (tipoCombustivel.equals("E")) {
            // se escolher etanol, multiplicar o consumo médio por 1,3 (30% a mais)
            consumoGasolina = 10 * 1.3;
            
         } else {
            System.out.println("Opção inválida. Escolha G para gasolina comum, A para gasolina aditivada ou E para etanol.");
            return;
          }

         System.out.println("Digite a quantidade de combustível no tanque (em litros): ");
         combustivel = scan.nextDouble();

         System.out.println("Digite a distância que pretende percorrer (em km): ");
         distancia = scan.nextDouble();

            double combustivelNecessario = distancia / consumoGasolina;
            if (combustivelNecessario <= combustivel) {
                double autonomia = combustivel * consumoGasolina;
                System.out.println("A autonomia do veículo é de " + autonomia + " km.");
            } else {
            System.out.println("Não é possível percorrer a distância desejada com o combustível disponível.");
         }
      } catch (Exception e) {
         System.out.println("Ocorreu um erro ao ler a entrada do usuário. Certifique-se de digitar valores numéricos válidos.");
         
      } 
    } 
} 

