package com.christophersanz.funcional.v10_optional;

import java.util.Comparator;
import java.util.Random;

public class Main {

    Random random = new Random();

    public Main() {
        Flujo.proveer(10, this::randomInt)
                .filtrar(valor -> valor >= 10)
                .ordenar(Integer::compareTo)
                .transformar(NumberUtils::elevarAlCuadrado)
                .transformar(Descripcion::new)
                .actuar(System.out::println)
                .transformar(Descripcion::getValue)
                .max(Comparator.naturalOrder())
                .ifPresentOrElse(
                        valor -> System.out.println("Máximo: " + valor.doubleValue()),
                        () -> System.out.println("No hay valor máximo porque el flujo está vacío")
                );
                //.reducir(0, Integer::sum);
    }

    private int randomInt(){
        return random.nextInt(10);
    }

    public static void main(String[] args) {
        new Main();
    }

}
