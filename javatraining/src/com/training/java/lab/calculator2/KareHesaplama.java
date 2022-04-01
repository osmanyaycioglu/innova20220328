package com.training.java.lab.calculator2;


public class KareHesaplama implements IHesaplama {

    @Override
    public double hesapla(final double... valuesParam) {
        return valuesParam[0] * valuesParam[0];
    }

    @Override
    public int getDegiskenSayisi() {
        return 1;
    }


}
