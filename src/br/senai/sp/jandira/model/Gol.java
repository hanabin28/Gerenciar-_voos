package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Gol extends Voos {
    private int numeroPassageiros = 216;
    public Gol(int numeroVoo, String dataFormatada, String origem, String destino) {
        super(numeroVoo, dataFormatada, origem, destino);
    }

    @Override
    public void exibirVoos() {
        super.exibirVoos();
        System.out.println("Capacidade de passageiros: " + numeroPassageiros);
        System.out.println();
    }
}
