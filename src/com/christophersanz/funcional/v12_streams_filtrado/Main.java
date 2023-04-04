package com.christophersanz.funcional.v12_streams_filtrado;

import java.util.stream.Stream;

public class Main {

    public Main() {

        //Filtrando por aquellos que no sean repetidos
        Stream.of(1, 3, 2, 3, 1)
                .distinct()
                .forEach(System.out::println);
        System.out.println("------------------");

        //Filtrando por el limite de elementos
        Stream.of(1, 3, 2, 3, 1)
                .limit(2)
                .forEach(System.out::println);
        System.out.println("------------------");

        //Filtrado genérico
        Stream.of(1, 3, 8, 5, 2)
                .filter(n -> n < 4)
                .forEach(System.out::println);
        System.out.println("------------------");

        //Excluye los primeros elementos
        Stream.of(1, 3, 8, 5, 2)
                .skip(2)
                .forEach(System.out::println);
        System.out.println("------------------");

    }

    public static void main(String[] args) {
        new Main();
    }

}
