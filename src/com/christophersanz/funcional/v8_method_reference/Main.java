package com.christophersanz.funcional.v8_method_reference;

import java.util.Random;

public class Main {

    Random random = new Random();

    public Main() {
        // proveer().filtrar().transformar().actuar().reducir()
        Integer total =  Flujo.proveer(10, this::randomInt)
                .filtrar(NumberUtils::esPrimo)
                .transformar(NumberUtils::elevarAlCuadrado)
                .actuar(System.out::println)
                .reducir(0, Integer::sum);
        System.out.println("Reducción: " + total);
    }

    private int randomInt(){
        return random.nextInt(10);
    }

    public static void main(String[] args) {
        new Main();
    }

}
