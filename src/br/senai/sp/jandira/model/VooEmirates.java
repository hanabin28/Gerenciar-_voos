package br.senai.sp.jandira.model;

public class VooEmirates extends Voos{
    private int numeroPassageiros = 550;
    public VooEmirates(int numeroVoo, String dataPartida, String origem, String destino) {
        super(numeroVoo, dataPartida, origem, destino);
    }
}
