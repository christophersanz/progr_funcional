package com.christophersanz.funcional.v2_superfunciones_clases.clases;

import com.christophersanz.funcional.v2_superfunciones_clases.interfaces.Consumidor;

public class Imprimir implements Consumidor {

    @Override
    public void aceptar(Integer valor) {
        System.out.println(valor);
    }

}
