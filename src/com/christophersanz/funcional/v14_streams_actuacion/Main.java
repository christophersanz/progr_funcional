package com.christophersanz.funcional.v14_streams_actuacion;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public Main() {

        //Tratamiento de recorrido genérico
        //-forEach como operación terminal
        Stream<Integer> result = Stream.of(2, 4, 6);
        result.forEach(System.out::println);
        System.out.println("------------------");

        //-peak como operación intermedia
        Stream<Integer> resultado = Stream.of(2, 4, 6);
        resultado.peek(System.out::println);
        System.out.println("------------------");

        //Tratamiento de recorrido genérico tipo lista
        List<Integer> resul = Stream.of(2, 4, 6)
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println(resul);
        System.out.println("------------------");

        //Tratamiento de recorrido ordenado
        Stream.of(2, 4, 6)
                .forEach(System.out::println);
        System.out.println("------------------");

        //Tratamiento de recorrido en diferentes hilos y no ordenado
        Stream.of(2, 4, 6).parallel()
                .forEach(System.out::println);
        System.out.println("------------------");

        //Tratamiento de recorrido en diferentes hilos y ordenado
        Stream.of(2, 4, 6).parallel()
                .forEachOrdered(System.out::println);
        System.out.println("------------------");

        //Tratamiento de recorrido ordenado mediante el método sorted
        Stream.of("Baldomero", "Germán Ginés", "Ambrosio")
                .sorted()
                .forEach(System.out::println);
        System.out.println("------------------");

        //Tratamiento de recorrido ordenado mediante el método compareTo
        Stream.of("Baldomero", "Germán Ginés", "Ambrosio")
                .sorted((s1,s2) -> s1.compareTo(s2))
                .limit(2)
                .forEach(System.out::println);
        System.out.println("------------------");

        //Tratamiento de recorrido ordenado mediante interfaz Comparable usando lambdas
        Stream.of("Baldomero", "Germán Ginés", "Ambrosio")
                .sorted(String::compareTo)
                .limit(2)
                .forEach(System.out::println);
        System.out.println("------------------");

        //Tratamiento de recorrido ordenado mediante interfaz Comparator usando lambdas
        Stream.of("Baldomero", "Germán Ginés", "Ambrosio")
                .sorted(Comparator.naturalOrder())
                .limit(2)
                .forEach(System.out::println);
        System.out.println("------------------");

    }

    public static void main(String[] args) {
        new Main();
    }

}
