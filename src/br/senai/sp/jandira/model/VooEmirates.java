package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class VooEmirates extends Voos{
    private int numeroPassageiros = 550;
    public VooEmirates(int numeroVoo, String dataFormatada, String origem, String destino) {
        super(numeroVoo, dataFormatada, origem, destino);
    }

    @Override
    public void exibirVoos() {
        super.exibirVoos();
        System.out.println("Capacidade de passageiros: " + numeroPassageiros);
        System.out.println();

    }
}
