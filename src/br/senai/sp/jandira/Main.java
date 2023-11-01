package br.senai.sp.jandira;

import br.senai.sp.jandira.model.VooEmirates;

public class Main {
    public static void main(String[] args) {
        VooEmirates voo1 = new VooEmirates(123, "01-11-2023", "São Paulo", "Los Angeles");
        voo1.adicionarVoo(voo1);
        voo1.exibirVoos();
    }
}
