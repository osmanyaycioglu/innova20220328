package com.training.java.lab.calculator2;


public class BolmeHesaplama implements IHesaplama {

    @Override
    public double hesapla(final double... valuesParam) {
        if (valuesParam[1] == 0D) {
            return 0D;
        }
        return valuesParam[0] / valuesParam[1];
    }

    @Override
    public int getDegiskenSayisi() {
        return 2;
    }

}
