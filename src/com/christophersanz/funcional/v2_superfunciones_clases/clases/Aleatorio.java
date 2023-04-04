package com.christophersanz.funcional.v2_superfunciones_clases.clases;

import com.christophersanz.funcional.v2_superfunciones_clases.interfaces.Proveedor;

import java.util.Random;

public class Aleatorio implements Proveedor {

    Random random = new Random();

    @Override
    public Integer obtener() {
        return random.nextInt(10);
    }

}
