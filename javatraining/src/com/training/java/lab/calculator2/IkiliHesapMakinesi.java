package com.training.java.lab.calculator2;

import java.util.ArrayList;
import java.util.Scanner;

public class IkiliHesapMakinesi extends AbstractHesapMakinesi {

    public IkiliHesapMakinesi(final Scanner scannerParam) {
        super(scannerParam);
        this.hesaplamalar = new ArrayList<>();
        this.hesaplamalar.add(new HesaplamaObjesi("toplama",
                                                  new ToplamaHesaplama()));
        this.hesaplamalar.add(new HesaplamaObjesi("cikarma",
                                                  new CikarmaHesaplama()));
    }

}
