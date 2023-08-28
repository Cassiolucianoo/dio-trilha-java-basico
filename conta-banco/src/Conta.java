import java.util.Scanner;

class Conta {
    String agencia;
    int numero;
    double saldo;

    void lerAgencia(Scanner scanner) {
        System.out.println("Por favor, informe o número da Agência");
        agencia = scanner.nextLine();
    }

    void lerNumero(Scanner scanner) {
        System.out.println("Digite o número da sua conta");
        numero = scanner.nextInt();
    }

    void lerSaldo(Scanner scanner) {
        System.out.println("Informe o valor a ser depositado");
        saldo = scanner.nextDouble();
    }

}