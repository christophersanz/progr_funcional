package com.christophersanz.funcional.v6_lambdas;

import java.util.Random;

public class Main {

    Random random = new Random();

    public Main() {
        // proveer().filtrar().transformar().actuar().reducir()
        Integer total =  Flujo.proveer(10, ()-> random.nextInt(10))
                .filtrar(valor -> valor % 2 == 0)
                .transformar(valor -> valor * valor)
                .actuar(valor -> System.out.println(valor))
                .reducir(0, (valor1, valor2) -> valor1 + valor2);
        System.out.println("Reducción: " + total);
    }

    public static void main(String[] args) {
        new Main();
    }

}
