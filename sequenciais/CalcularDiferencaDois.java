package sequenciais;
import javax.swing.JOptionPane;
public class CalcularDiferencaDois {
     public static void main(String[] args) {
        int A, B, C, D;
        
            JOptionPane.showMessageDialog(null, "Bem-vindo à calculadora de diferenças divertida!");
            JOptionPane.showMessageDialog(null, "Digite quatro números para descobrir a diferença entre o produto dos dois primeiros e o produto dos dois últimos.");
            
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
        D = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número:"));
        
                    int diferenca = (A * B - C * D);
        
        JOptionPane.showMessageDialog(null, "A diferença entre o produto de " + A + " e " + B + " e o produto de " + C + " e " + D + " é: " + diferenca);
        
        String resposta = JOptionPane.showInputDialog("Foi divertido calcular com você. Vamos jogar novamente? (s/n)");
        
      while (resposta.equalsIgnoreCase("s")) {
            A = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
            B = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
            C = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
            D = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número:"));
            
            diferenca = (A * B - C * D);
            
            JOptionPane.showMessageDialog(null, "A diferença entre o produto de " + A + " e " + B + " e o produto de " + C + " e " + D + " é: " + diferenca);
            
            resposta = JOptionPane.showInputDialog("Foi divertido calcular com você. Vamos jogar novamente? (s/n)");
        }
        
        JOptionPane.showMessageDialog(null, "Obrigado por jogar a calculadora de diferenças!");
    }
}
