package com.cassiolucianoo.poo;

public class App {
	public static void main(String[] args) {
        iPhone myiPhone = new iPhone();
        
        myiPhone.ligar();
        myiPhone.atenderChamada();
        myiPhone.tocarMusica();
        
        Musica musica = new Musica("blind", "korn", 180);
        myiPhone.selecionarMusica(musica);
        myiPhone.tocarMusica();
        
        Aba aba = new Aba("https://web.dio.me/", "Curso");
        myiPhone.adicionarNovaAba(aba);
        myiPhone.exibirPagina(aba.getUrl());
        myiPhone.atualizarPagina(aba);
        
        Chamada chamada = new Chamada("123456789", 60);
        myiPhone.atenderChamada();
        myiPhone.iniciarCorreioVoz();

        System.out.println("Chamada atendida de: " + chamada.getNumero());
        System.out.println("Duração da chamada: " + chamada.getDuracao() + " segundos");

        
        myiPhone.desligar();
    }
}
