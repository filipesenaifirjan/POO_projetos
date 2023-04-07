package sequenciais;
import java.util.Scanner;
public class CalcularDedicacaoSerasa {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a nota do aluno na Serasa: ");
        double nota = sc.nextDouble();

        System.out.print("Informe a quantidade de horas de estudo diárias do aluno na Serasa: ");
        double horasDeEstudo = sc.nextDouble();

        double nivelDeDedicacao = 0;

        if (nota >= 9 && horasDeEstudo >= 4) {
            nivelDeDedicacao = 10;
        } else if (nota >= 8 && horasDeEstudo >= 3) {
            nivelDeDedicacao = 9;
        } else if (nota >= 7 && horasDeEstudo >= 2) {
            nivelDeDedicacao = 8;
        } else if (nota >= 6 && horasDeEstudo >= 1) {
            nivelDeDedicacao = 7;
        } else {
            nivelDeDedicacao = 6;
        }

        System.out.println("O nível de dedicação do aluno na Serasa é: " + nivelDeDedicacao);

        sc.close();
    }
}
