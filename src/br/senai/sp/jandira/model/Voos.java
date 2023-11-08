package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

abstract class Voos {
    private int numeroVoo;
    private LocalDate dataPartida = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String dataFormatada = dataPartida.format(formatter);
    private String origem, destino;

    List<Voos> listVoos = new ArrayList<>();


    public void adicionarVoo(Voos voo){
        listVoos.add(voo);
    }

    public void exibirVoos(){
        for (Voos voo: listVoos){
            System.out.println("Número do vôo: " + voo.getNumeroVoo());
            System.out.println("Data de partida: " + voo.getDataFormatada());
            System.out.println("Local de partida: " + voo.getOrigem());
            System.out.println("Local de destino: " + voo.getDestino());
        }
    }



    public Voos(int numeroVoo, String dataFormatada, String origem, String destino) {
        this.numeroVoo = numeroVoo;
        this.dataFormatada = dataFormatada;
        this.origem = origem;
        this.destino = destino;
    }


    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getDataFormatada() {
        return dataFormatada;
    }

    public void setDataFormatada(String dataFormatada) {
        this.dataFormatada = dataFormatada;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
