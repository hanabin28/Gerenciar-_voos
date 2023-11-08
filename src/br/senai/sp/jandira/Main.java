package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Menu;
import br.senai.sp.jandira.model.VooDelta;
import br.senai.sp.jandira.model.VooEmirates;

public class Main {
    public static void main(String[] args) {
        VooEmirates voo1 = new VooEmirates(123, "06/11/2019", "São Paulo", "Los Angeles");
        voo1.adicionarVoo(voo1);
        voo1.exibirVoos();

        VooDelta voo2 = new VooDelta(345, "08/11/2023", "Los Angeles", "São Paulo");
        voo2.adicionarVoo(voo2);
        voo2.exibirVoos();
    }
}
