package com.christophersanz.funcional.v11_streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public Main() {

        //-Creando un pipeline
        List<String> nombres = new ArrayList<>(List.of("Manolo", "Pedro", "Baldomero"));

        //1.-Función generadora del stream
        nombres.stream()
        //2.-Proporcionar cero o más operaciones intermedias
        .filter(nombre -> nombre.contains("P"))
        //3.-Ejecutar mediante una operacion final
        .forEach(System.out::println);
        System.out.println("------------------");

        //1.-Función generadora del stream
        List<String> resultado = nombres.stream()
        //2.-Proporcionar cero o más operaciones intermedias
        .filter(nombre -> nombre.contains("P"))
        //3.-Ejecutar mediante una operacion final
        .collect(Collectors.toList());
        System.out.println(resultado);
        System.out.println("------------------");

        //Stream finitos
        String[] students = {"Baldomero", "Germán Ginés", "Godofredo"};
        Stream<String> stream = Arrays.stream(students);
        stream.forEach(System.out::println);
        System.out.println("------------------");

        Stream<String> employees = Stream.of("Carlos", "Fernando", "Iván Quiroz");
        employees.forEach(System.out::println);
        System.out.println("------------------");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Full Stack");
        map.put(2, "Backend");
        Stream<Map.Entry<Integer, String>> streamRoles = map.entrySet().stream();
        streamRoles.forEach(System.out::println);
        System.out.println("------------------");


        //Creado streams de enteros
        List<Integer> result1 = Stream.iterate(1, valor -> valor * 5)
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(result1);
        System.out.println("------------------");

        List<Integer> result2 = Stream.iterate(1, valor -> valor < 100, valor -> valor * 5)
                .collect(Collectors.toList());
        System.out.println(result2);
        System.out.println("------------------");

        List<Integer> result3 = new Random().ints(5, 0, 10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(result3);
        System.out.println("------------------");

        List<Integer> result4 = IntStream.range(0, 10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(result4);
        System.out.println("------------------");

        //Stream infinito
        List<Integer> result5 = Stream.generate(() -> new Random().nextInt(10))
                .collect(Collectors.toList());
        //System.out.println(result5);
        System.out.println("------------------");

    }

    public static void main(String[] args) {
        new Main();
    }

}
