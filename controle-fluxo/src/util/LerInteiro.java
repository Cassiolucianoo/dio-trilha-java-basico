package util;
import java.util.Scanner;

public class LerInteiro {
	
	public static int lerInteiro(String mensagem, Scanner scanner) {
        int valor = 0;
        boolean valido = false;
        
        while (!valido) {
            System.out.print(mensagem);
            String input = scanner.nextLine();
            
            try {
                valor = Integer.parseInt(input);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número inteiro.");
            }
        }
        
        return valor;
    }

}
