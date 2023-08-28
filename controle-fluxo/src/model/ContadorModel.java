package model;

import util.ParametrosInvalidosException;
import util.Validador;

public class ContadorModel {
    public void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        Validador.validarParametros(parametroUm, parametroDois);
        
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}