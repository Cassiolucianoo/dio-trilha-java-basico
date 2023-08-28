import java.util.Scanner;

class Cliente {
    String nome;

    void lerNome(Scanner scanner) {
        System.out.println("Informe o seu nome completo");
        nome = scanner.nextLine();
    }
}