package estruturas_condicionais;
import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        
        while (true) {
           
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1 - Cachorro-quente (R$ 4,00)");
            System.out.println("2 - X-salada (R$ 4,50)");
            System.out.println("3 - X-bacon (R$ 5,00)");
            System.out.println("4 - Torrada simples (R$ 2,00)");
            System.out.println("5 - Encerrar compra");
            System.out.print("Digite o número do lanche desejado: ");
            int opcao = input.nextInt();
            
            if (opcao == 5) {
                break;
            }
            
            
            int quantidade;
            double valor;
            
            switch (opcao) {
                case 1:
                    valor = 4.00;
                    System.out.print("Digite a quantidade de cachorro-quentes: ");
                    quantidade = input.nextInt();
                    total += valor * quantidade;
                    System.out.println(quantidade + " cachorro-quentes adicionados ao carrinho.");
                    break;
                case 2:
                    valor = 4.50;
                    System.out.print("Digite a quantidade de x-saladas: ");
                    quantidade = input.nextInt();
                    total += valor * quantidade;
                    System.out.println(quantidade + " x-saladas adicionadas ao carrinho.");
                    break;
                case 3:
                    valor = 5.00;
                    System.out.print("Digite a quantidade de x-bacons: ");
                    quantidade = input.nextInt();
                    total += valor * quantidade;
                    System.out.println(quantidade + " x-bacons adicionados ao carrinho.");
                    break;
                case 4:
                    valor = 2.00;
                    System.out.print("Digite a quantidade de torradas simples: ");
                    quantidade = input.nextInt();
                    total += valor * quantidade;
                    System.out.println(quantidade + " torradas simples adicionadas ao carrinho.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            
            System.out.println(); 
        }
        
     
        System.out.println("Total a pagar: R$ " + total);
        System.out.println("Obrigado pela preferência!");
        input.close();
    }
}
//ele vai rodar até voce finalizar a compra digitando 5