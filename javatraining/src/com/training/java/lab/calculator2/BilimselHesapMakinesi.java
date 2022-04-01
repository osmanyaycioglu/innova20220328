package com.training.java.lab.calculator2;

import java.util.ArrayList;
import java.util.Scanner;

public class BilimselHesapMakinesi extends AbstractHesapMakinesi {

    public BilimselHesapMakinesi(final Scanner scannerParam) {
        super(scannerParam);
        this.hesaplamalar = new ArrayList<>();
        this.hesaplamalar.add(new HesaplamaObjesi("toplama",
                                                  new ToplamaHesaplama()));
        this.hesaplamalar.add(new HesaplamaObjesi("cikarma",
                                                  new CikarmaHesaplama()));
        this.hesaplamalar.add(new HesaplamaObjesi("carpma",
                                                  new CarpmaHesaplama()));
        this.hesaplamalar.add(new HesaplamaObjesi("bolme",
                                                  new BolmeHesaplama()));
        this.hesaplamalar.add(new HesaplamaObjesi("logaritma",
                                                  new logaritmikHesaplama()));

    }

}
