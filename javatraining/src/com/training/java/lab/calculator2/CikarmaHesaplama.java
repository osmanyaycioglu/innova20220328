package com.training.java.lab.calculator2;


public class CikarmaHesaplama implements IHesaplama {

    @Override
    public double hesapla(final double... valuesParam) {
        return valuesParam[0] - valuesParam[1];
    }

    @Override
    public int getDegiskenSayisi() {
        return 2;
    }

}
