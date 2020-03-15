import com.sun.deploy.security.SelectableSecurityManager;

public class VerificandoIdade {
    public static void main(String[] args) {
        int idade = 10;
        if (idade > 18) {
            System.out.println("Adulto");
        }   else {
            System.out.println("Ainda não é adulto");
        }
    }
}
