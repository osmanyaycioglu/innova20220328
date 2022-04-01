package com.training.java.lab.calculator2;


public class logaritmikHesaplama implements IHesaplama {

    @Override
    public double hesapla(final double... valuesParam) {
        return Math.log(valuesParam[0]);
    }

    @Override
    public int getDegiskenSayisi() {
        return 1;
    }


}
