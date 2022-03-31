package com.training.java.lab.calculator2;


public class BolmeHesaplama implements IHesaplama {

    @Override
    public double hesapla(final double value1Param,
                          final double value2Param) {
        if (value2Param == 0D) {
            return 0D;
        }
        return value1Param / value2Param;
    }

}
