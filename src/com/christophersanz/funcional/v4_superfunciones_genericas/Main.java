package com.christophersanz.funcional.v4_superfunciones_genericas;

import com.christophersanz.funcional.v4_superfunciones_genericas.interfaces.*;

import java.util.List;
import java.util.Random;

public class Main {

    public Main() {
        //¿QUE QUEREMOS HACER?
        //1.- Crear lista de enteros.
        List<Integer> numeros = SuperFunciones.proveer(10, new Proveedor<>() {
            Random random = new Random();
            @Override
            public Integer obtener() {
                return random.nextInt(10);
            }
        });
        System.out.println(numeros);
        //2.- Quedarme solo con los pares.
        List<Integer> filtrados = SuperFunciones.filtrar(numeros, new Predicado<>() {
            @Override
            public boolean test(Integer valor) {
                return valor % 2 == 0;
            }
        });
        System.out.println(filtrados);
        //3a.- Obtener el cuadrado de cada número.
        List<Integer> transformados = SuperFunciones.transformar(filtrados, new OperadorUnario<>() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        });
        System.out.println(transformados);
        //3a.- Obtener cada número convertido en cadena.
        List<String> convertidosEnCadena = SuperFunciones.transformar(filtrados, new Funcion<Integer, String>() {
            @Override
            public String aplicar(Integer valor) {
                return "Valor: " + valor;
            }
        });
        System.out.println(convertidosEnCadena);
        Consumidor<Integer> impresor = new Consumidor<>() {
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        };
        //4a.- Mostrar cada cuadrado por pantalla y retornar lista.
        List<Integer> actuados = SuperFunciones.actuar(transformados, impresor);
        //4b.- Mostrar cada cuadrado por pantalla y no retornar nada.
        SuperFunciones.consumir(transformados, impresor);
        //5.- Obtener la suma de los cuadrados.
        Integer total = SuperFunciones.reducir(actuados, 0, new OperadorBinario<>() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1 + valor2;
            }
        });
        System.out.println("Reducción: " + total);
    }

    public static void main(String[] args) {
        new Main();
    }

}
