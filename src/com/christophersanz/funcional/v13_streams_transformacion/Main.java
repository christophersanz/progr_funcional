package com.christophersanz.funcional.v13_streams_transformacion;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public Main() {

        //Transformación a String de tipo Stream
        Stream.of(1, 2, 3)
                .map(n -> "Valor " + n)
                .forEach(System.out::println);
        System.out.println("------------------");

        //Transformación a String de tipo Lista usando map
        List<String> resultado = IntStream.range(0, 10)
                 .boxed()
                 .map(integer -> "V("+integer+")")
                 .collect(Collectors.toList());
        System.out.println(resultado);
        System.out.println("------------------");

        //Transformación a Integer de tipo Lista usando flatmap
        List<Integer> resultado2 = Stream.of(2, 4, 6)
                .flatMap(this::getRamdomNumbers)
                .collect(Collectors.toList());
        System.out.println(resultado2);
        System.out.println("------------------");

        //Transformación hacia tipos primitivos
        DoubleStream stream = DoubleStream.of(5.2, 4.2, 6.3);
        stream.forEach(System.out::println);
        System.out.println("------------------");

        List<Double> result = DoubleStream.of(5.2, 4.2, 6.3)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(result);
        System.out.println("------------------");

    }

    Stream<Integer> getRamdomNumbers(Integer size){
        return new Random().ints(size, 0 ,10).boxed();
    }


    public static void main(String[] args) {
        new Main();
    }

}
