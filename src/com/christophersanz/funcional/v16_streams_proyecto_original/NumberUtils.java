package com.christophersanz.funcional.v16_streams_proyecto_original;

public class NumberUtils {

    private NumberUtils() {
    }

    public static boolean esPrimo(int valor){
        for (int i = 2; i < valor; i++){
            if (valor % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int elevarAlCuadrado(int valor){
        return valor * valor;
    }

}
