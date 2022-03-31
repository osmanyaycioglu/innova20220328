package com.training.java.lab.calculator2;


public class ToplamaHesaplama implements IHesaplama {

    @Override
    public double hesapla(final double value1Param,
                          final double value2Param) {
        return value1Param + value2Param;
    }

}
