package com.christophersanz.funcional.v17_streams_oper_term_consulta;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public Main() {

        //Operaciones de corto circuito
        boolean todosPares = Stream.of(2, 4, 6)
                .allMatch(n -> n % 2 == 0);
        System.out.println(todosPares);
        System.out.println("------------------");

        boolean todosImpares = Stream.of(1, 2, 3)
            .allMatch(n -> n % 2 != 0);
        System.out.println(todosImpares);
        System.out.println("------------------");

        boolean ningunoImpar = Stream.of(2, 4, 6)
                .noneMatch(n -> n % 2 != 0);
        System.out.println(ningunoImpar);
        System.out.println("------------------");

        boolean algunoImpar = Stream.of(1, 2, 3)
                .anyMatch(n -> n % 2 != 0);
        System.out.println(algunoImpar);
        System.out.println("------------------");

        Optional<Integer> filtrandoPrimerImpar = Stream.of(1, 2, 3)
                .filter(n -> n % 2 != 0)
                .findFirst();
        System.out.println(filtrandoPrimerImpar);
        System.out.println("------------------");

        Optional<Integer> filtrandoAlgunImpar = Stream.of(1, 2, 3)
                .filter(n -> n % 2 != 0)
                .findAny();
        System.out.println(filtrandoAlgunImpar);
        System.out.println("------------------");

        List<Integer> lista = Arrays.asList(1, 2, 3);
        long count = lista.stream().count();
        Optional<Integer> filtrandoUltimoElementoImpar = lista.stream()
                .skip(count - 1)
                .findFirst();
        System.out.println(filtrandoUltimoElementoImpar);
        System.out.println("------------------");


    }

    public static void main(String[] args) {
        new Main();
    }

}
