package com.training.java.lab.calculator2;

import java.util.List;
import java.util.Scanner;

public abstract class AbstractHesapMakinesi implements IHesapMakinasi {

    protected List<HesaplamaObjesi> hesaplamalar;
    private final Scanner           scanner;


    public AbstractHesapMakinesi(final Scanner scannerParam) {
        this.scanner = scannerParam;
    }

    private void menuGoster() {
        int index = 1;
        for (HesaplamaObjesi hesaplamaObjesiLoc : this.hesaplamalar) {
            System.out.println(index + "-" + hesaplamaObjesiLoc.getIslemIsmi());
            index++;
        }
        System.out.println(index + "-Cikis");
    }

    @Override
    public void hesapMakinasiCalistir() {
        try (Scanner scannerLoc = new Scanner(System.in)) {
            while (true) {
                this.menuGoster();
                System.out.println("Seçiminiz : ");
                int secim = scannerLoc.nextInt();
                if (this.hesaplamalar.size() >= secim) {
                    HesaplamaObjesi hesaplamaObjesiLoc = this.hesaplamalar.get(secim - 1);
                    IHesaplama hesaplamaLoc = hesaplamaObjesiLoc.getHesaplama();
                    int degiskenSayisiLoc = hesaplamaLoc.getDegiskenSayisi();
                    double[] degiskenler = new double[degiskenSayisiLoc];
                    for (int iLoc = 0; iLoc < degiskenler.length; iLoc++) {
                        System.out.println(hesaplamaObjesiLoc.getIslemIsmi() + " için " + (iLoc + 1) + ". değişken : ");
                        degiskenler[iLoc] = scannerLoc.nextDouble();
                    }
                    double hesaplaLoc = hesaplamaLoc.hesapla(degiskenler);
                    System.out.println(hesaplamaObjesiLoc.getIslemIsmi() + " işleminizin sonucu : " + hesaplaLoc);
                } else {
                    break;
                }
            }
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }


}
