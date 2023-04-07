package sequenciais;
import java.util.Scanner;
public class Salario {
    
    public static void main(String[] args) {
    
   
    Scanner scan = new Scanner(System.in);
    
   int registro;
  double  horas, valorhora;
    
    System.out.println("Qual é o seu número de registro?");
    registro = scan.nextInt();
    System.out.println("Quantas horas você trabalhou?");
    horas = scan.nextDouble();
    System.out.println("Quanto você ganha por hora?");
    valorhora = scan.nextDouble();
    
     double salario = (horas * valorhora);
    
    System.out.println();
    System.out.println("Registro: " + registro);
    System.out.printf("Salário Total: R$ %.2f %n", salario);
    
    scan.close();
    }
    }