package com.training.java.lab.calculator2;

import java.util.Scanner;

public class HesapMakinesiFabrikasi {

    public static IHesapMakinasi createHesapMakinasi(final Scanner scannerParam,
                                                     final EHesapmakinasiTipi eHesapmakinasiTipiParam) {
        IHesapMakinasi hesapMakinesiLoc = null;
        switch (eHesapmakinasiTipiParam) {
            case BILIMSEL:
                hesapMakinesiLoc = new BilimselHesapMakinesi(scannerParam);
                break;
            case MATEMATIKSEL:
                hesapMakinesiLoc = new MatematikselHesapMakinesi(scannerParam);
                break;
            case STANDART:
                hesapMakinesiLoc = new StandartHesapMakinesi(scannerParam);
                break;
            case IKILI:
                hesapMakinesiLoc = new IkiliHesapMakinesi(scannerParam);
                break;
            default:
                hesapMakinesiLoc = new StandartHesapMakinesi(scannerParam);
                break;
        }
        return hesapMakinesiLoc;

    }
}
