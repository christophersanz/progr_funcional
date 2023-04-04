package com.christophersanz.funcional.v15_streams_reduccion;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public Main() {

        //Método count para contar los elementos del Stream
        //Retorna un long
        long cuantosSonPares = Stream.of(1, 2, 3)
            .filter(n -> n % 2 == 0)
            .count();
        System.out.println(cuantosSonPares);
        System.out.println("------------------");

        //Método sum para obtener la suma los elementos del Stream
        //Para los tipos IntStream, LongStream, DoubleStream
        //Retorna un int, long, double
        int range = IntStream.range(1, 10)
                .sum();
        System.out.println(range);
        System.out.println("------------------");

        int sum = Stream.of(1, 2, 3)
                .mapToInt(Integer::intValue)
                .peek(System.out::println)
                .sum();
        System.out.println(sum);
        System.out.println("------------------");

        //Método max para obtener el valor máximo de los elementos del Stream
        //Retorna un OptionalInt, OptionalDouble, OptionalLong
        OptionalInt resultado = Stream.of(1, 2, 3)
                .filter(valor -> valor >= 5)
                .mapToInt(Integer::intValue)
                .max();
        if (resultado.isPresent()){
            System.out.println(resultado.getAsInt());
        }
        System.out.println("------------------");

        //Método max para obtener el valor máximo de los elementos del Stream mejorado
        Stream.of(1, 2, 3)
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);
        System.out.println("------------------");

        //Método max para obtener el valor máximo de los elementos del Stream usando optional
        Stream.of(1, 2, 3)
                .filter(valor -> valor >= 5)
                .mapToInt(Integer::intValue)
                .max()
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("El stream ha quedado vacío"));
        System.out.println("------------------");

        //Método min para obtener el valor minimo de los elementos del Stream
        Stream.of(1, 2, 3)
                .mapToInt(Integer::intValue)
                .min()
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("El stream ha quedado vacío"));
        System.out.println("------------------");

        //Método average para obtener la media de los elementos del Stream
        //Retorna un Double
        Stream.of(1, 2, 3)
                .mapToInt(Integer::intValue)
                .peek(System.out::println)
                .average()
                .ifPresentOrElse(System.out::println,
                                () -> System.out.println("El stream ha quedado vacío"));
        System.out.println("------------------");

        //Método reduce para multiplicar los valores del Stream
        Stream.of(2, 3, 4)
                //.filter(valor -> valor >= 5)
                .reduce((acumulador, valor) -> acumulador * valor)
                .ifPresentOrElse(System.out::println,
                                () -> System.out.println("El stream ha quedado vacío y no hay reducción"));
        System.out.println("------------------");

        //Método reduce para multiplicar los valores del Stream especificando el valor del acumulador
        Integer result = Stream.of(2, 3, 4)
                .reduce(1, (acumulador, valor) -> acumulador * valor);
        System.out.println(result);
        System.out.println("------------------");

        //Método reduce para multiplicar los valores del Stream usando filtro
        Integer result2 = Stream.of(2, 3, 4)
                .filter(valor -> valor >= 5)
                .reduce(1, (acumulador, valor) -> acumulador * valor);
        System.out.println(result2);
        System.out.println("------------------");

        //Método reduce para sumar las edades de los estudiantes
        Integer result3 = Stream.of(
                new Student("Manolo", 20),
                new Student("Baldomero", 30),
                new Student("Germán", 40)
        ).reduce(0, (acumulador, student) -> acumulador + student.getAge(), Integer::sum);
        System.out.println(result3);
        System.out.println("------------------");

    }

    public static void main(String[] args) {
        new Main();
    }

}
