package estruturas_repetitivas;

import java.util.Scanner;

public class ResultMultiplicacao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas vezes deseja multiplicar dois números? ");
        int repeticoes = scan.nextInt();

        for (int i = 0; i < repeticoes; i++) {
            System.out.println("Digite o primeiro número: ");
            double x = scan.nextDouble();

            System.out.println("Digite o segundo número: ");
            double y = scan.nextDouble();

            double resultado = x * y;
            System.out.printf("Resultado da multiplicação: %.2f%n", resultado);
        }

        scan.close();

    }

}
