package com.christophersanz.funcional.v3_superfunciones_inline_clases;

import com.christophersanz.funcional.v3_superfunciones_inline_clases.interfaces.*;

import java.util.List;
import java.util.Random;

public class Main {

    public Main() {
        //¿QUE QUEREMOS HACER?
        //1.- Crear lista de enteros.
        List<Integer> numeros = SuperFunciones.proveer(10, new Proveedor() {
            Random random = new Random();
            @Override
            public Integer obtener() {
                return random.nextInt(10);
            }
        });
        System.out.println(numeros);
        //2.- Quedarme solo con los pares.
        List<Integer> filtrados = SuperFunciones.filtrar(numeros, new Predicado() {
            @Override
            public boolean test(Integer valor) {
                return valor % 2 == 0;
            }
        });
        System.out.println(filtrados);
        //3.- Obtener el cuadrado de cada número.
        List<Integer> transformados = SuperFunciones.transformar(filtrados, new Funcion() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        });
        System.out.println(transformados);
        //4a.- Mostrar cada cuadrado por pantalla y retornar lista.
        Consumidor impresor = new Consumidor() {
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        };
        List<Integer> actuados = SuperFunciones.actuar(transformados, impresor);
        //4b.- Mostrar cada cuadrado por pantalla y no retornar nada.
        SuperFunciones.consumir(transformados, impresor);
        //5.- Obtener la suma de los cuadrados.
        int total = SuperFunciones.reducir(actuados, 0, new FuncionBinaria() {
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
