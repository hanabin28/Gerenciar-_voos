package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void executarMenu(){
        boolean continuar = true;

        do {
            System.out.println("/-/-/-/-/ Menu /-/-/-/-/");
            System.out.println("Para saber informações sobre um vôo, digite abaixo o \nnúmero do vôo, ou a data de partida, ou o local de \npartida ou destino:");

        }while (continuar);
    }
}
