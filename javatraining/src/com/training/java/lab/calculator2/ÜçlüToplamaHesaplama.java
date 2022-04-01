package com.training.java.lab.calculator2;


public class ÜçlüToplamaHesaplama implements IHesaplama {

    @Override
    public double hesapla(final double... valuesParam) {
        return valuesParam[0] + valuesParam[1] + valuesParam[2];
    }

    @Override
    public int getDegiskenSayisi() {
        return 3;
    }


}
