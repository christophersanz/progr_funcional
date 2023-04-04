package com.christophersanz.funcional.v16_streams_proyecto_original;

import java.util.Comparator;
import java.util.Random;

public class Main {

    Random random = new Random();

    public Main() {
//        Flujo.proveer(10, this::randomInt)
//                .filtrar(valor -> valor >= 10)
//                .ordenar(Integer::compareTo)
//                .transformar(NumberUtils::elevarAlCuadrado)
//                .transformar(Descripcion::new)
//                .actuar(System.out::println)
//                .transformar(Descripcion::getValue)
//                .max(Comparator.naturalOrder())
//                .ifPresentOrElse(
//                        valor -> System.out.println("Máximo: " + valor.doubleValue()),
//                        () -> System.out.println("No hay valor máximo porque el flujo está vacío")
//                );

          random.ints(10, 1, 11).boxed()
                  .filter(valor -> valor >= 5)
                  .sorted(Integer::compareTo)
                  .map(NumberUtils::elevarAlCuadrado)
                  .map(Descripcion::new)
                  .peek(System.out::println)
                  .map(Descripcion::getValue)
                  .max(Comparator.naturalOrder())
                  .ifPresentOrElse(
                        valor -> System.out.println("Máximo: " + valor.doubleValue()),
                        () -> System.out.println("No hay valor máximo porque el flujo está vacío")
                );
    }

    private int randomInt(){
        return random.nextInt(10);
    }

    public static void main(String[] args) {
        new Main();
    }

}
