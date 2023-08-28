package view;

import java.util.Scanner;
import model.ContadorModel;
import util.LerInteiro;
import util.ParametrosInvalidosException;


public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = LerInteiro.lerInteiro("Digite o primeiro parâmetro: ", terminal);
        int parametroDois = LerInteiro.lerInteiro("Digite o segundo parâmetro: ", terminal);

        ContadorModel model = new ContadorModel();
        try {
            model.contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }
}