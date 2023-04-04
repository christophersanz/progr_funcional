package com.christophersanz.funcional.v9_method_reference_avanzado;

import java.util.Random;

public class Main {

    Random random = new Random();

    public Main() {
        Integer total =  Flujo.proveer(10, this::randomInt)
                .filtrar(NumberUtils::esPrimo)
                .ordenar(Integer::compareTo)
                .transformar(NumberUtils::elevarAlCuadrado)
                .transformar(Descripcion::new)
                .actuar(System.out::println)
                .transformar(Descripcion::getValue)
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
