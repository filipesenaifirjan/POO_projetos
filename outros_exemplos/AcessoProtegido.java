package outros_exemplos;
import java.util.Scanner;

public class AcessoProtegido {
    private static final String SENHA_CORRETA = "12345";

    public void acessar() {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        scanner.close();
        try {
            verificarSenha(senha);
            System.out.println("Acesso permitido!");
        } catch (SenhaInvalidaException e) {
            System.out.println("Acesso negado: " + e.getMessage());
        }
    }
    
    private void verificarSenha(String senha) throws SenhaInvalidaException {
        if (!senha.equals(SENHA_CORRETA)) {
            throw new SenhaInvalidaException("Senha incorreta.");
            
        }
    }

    public static void main(String[] args) {
        AcessoProtegido acessoProtegido = new AcessoProtegido();
        acessoProtegido.acessar();
        
    }
}

class SenhaInvalidaException extends Exception {
    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    
        
    }
    
}    

