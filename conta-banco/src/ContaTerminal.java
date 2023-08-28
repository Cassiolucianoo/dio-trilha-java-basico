import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Cliente cliente = new Cliente();
        cliente.lerNome(scanner);

        Conta conta = new Conta();
        conta.lerAgencia(scanner);
        conta.lerNumero(scanner);
        conta.lerSaldo(scanner);

        Banco banco = new Banco();
        banco.apresentarDados(cliente, conta);
    }
}


