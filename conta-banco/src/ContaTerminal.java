import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, informe o numero da Agência");
        String agencia = scanner.next();

        System.out.println("Digite o numero da sua conta");
        int numero = scanner.nextInt();

        System.out.println("Informe o seu nome completo");
        String nome = scanner.next();

        System.out.println("Informe o valor a ser depositado");
        double saldo = scanner.nextDouble();
    
        //imprimindo os dados obtidos pelo usuario

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
   
    }

}


