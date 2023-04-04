package com.christophersanz.funcional.v2_superfunciones_clases.clases;

import com.christophersanz.funcional.v2_superfunciones_clases.interfaces.Proveedor;

import java.util.Random;

public class Naturales implements Proveedor {

    private static int next = 0;

    @Override
    public Integer obtener() {
        return next++;
    }

}
