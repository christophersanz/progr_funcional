package com.christophersanz.funcional.v2_superfunciones_clases;

import com.christophersanz.funcional.v2_superfunciones_clases.clases.*;

import java.util.List;

public class Main {

    public Main() {
        //¿QUE QUEREMOS HACER?
        //1.- Crear lista de enteros.
        List<Integer> numeros = SuperFunciones.proveer(10, new Naturales());
        System.out.println(numeros);
        //2.- Quedarme solo con los pares.
        List<Integer> filtrados = SuperFunciones.filtrar(numeros, new SoloPares());
        System.out.println(filtrados);
        //3.- Obtener el cuadrado de cada número.
        List<Integer> transformados = SuperFunciones.transformar(filtrados, new AlCubo());
        System.out.println(transformados);
        //4a.- Mostrar cada cuadrado por pantalla y retornar lista.
        List<Integer> actuados = SuperFunciones.actuar(transformados, new Imprimir());
        //4b.- Mostrar cada cuadrado por pantalla y no retornar nada.
        SuperFunciones.consumir(transformados, new Imprimir());
        //5.- Obtener la suma de los cuadrados.
        int total = SuperFunciones.reducir(actuados, 1, new Sumador());
        System.out.println("Reducción: " + total);
    }

    public static void main(String[] args) {
        new Main();
    }
    
}
