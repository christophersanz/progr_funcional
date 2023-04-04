package com.christophersanz.funcional.v5_flujo;

import com.christophersanz.funcional.v5_flujo.interfaces.*;

import java.util.List;
import java.util.Random;

public class Main {

    public Main() {
        //¿QUE QUEREMOS HACER?
        // proveer().filtrar().transformar().actuar().reducir()
        Integer total =  new Flujo<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8))
        .filtrar(new Predicado<>() {
            @Override
            public boolean test(Integer valor) {
                return valor % 2 == 0;
            }
        }).transformar(new OperadorUnario<>() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        }).actuar(new Consumidor<>() {
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        }).reducir(0, new OperadorBinario<>() {
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
