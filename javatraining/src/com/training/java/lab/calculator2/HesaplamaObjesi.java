package com.training.java.lab.calculator2;


public class HesaplamaObjesi {

    private String     islemIsmi;
    private IHesaplama hesaplama;


    public HesaplamaObjesi(final String islemIsmiParam,
                           final IHesaplama hesaplamaParam) {
        super();
        this.islemIsmi = islemIsmiParam;
        this.hesaplama = hesaplamaParam;
    }

    public String getIslemIsmi() {
        return this.islemIsmi;
    }

    public void setIslemIsmi(final String islemIsmiParam) {
        this.islemIsmi = islemIsmiParam;
    }

    public IHesaplama getHesaplama() {
        return this.hesaplama;
    }

    public void setHesaplama(final IHesaplama hesaplamaParam) {
        this.hesaplama = hesaplamaParam;
    }


}
