import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();

        double valorFinal = calcularJurosCompostos(valorInicial, taxaJuros, periodo);

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }

    // Função para calcular o valor final com juros compostos
    public static double calcularJurosCompostos(double valorInicial, double taxaJuros, int periodo) {
        // Converter a taxa de juros para formato decimal
  

        // Calcular o valor final com juros compostos
        double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);
        
        return valorFinal;
    }
}
