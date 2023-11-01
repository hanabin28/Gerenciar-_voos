package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

abstract class Voos {
    private int numeroVoo;
    private String origem, destino, dataPartida;

    List<Voos> listVoos = new ArrayList<>();


    public void adicionarVoo(Voos voo){
        listVoos.add(voo);
    }

    public void exibirVoos(){
        for (Voos voo: listVoos){
            System.out.println(voo.getNumeroVoo());
            System.out.println(voo.getDataPartida());
            System.out.println(voo.getOrigem());
            System.out.println(voo.getDestino());
        }
    }



    public Voos(int numeroVoo, String dataPartida, String origem, String destino) {
        this.numeroVoo = numeroVoo;
        this.dataPartida = dataPartida;
        this.origem = origem;
        this.destino = destino;
    }


    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
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
