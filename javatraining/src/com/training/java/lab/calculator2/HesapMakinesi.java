package com.training.java.lab.calculator2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HesapMakinesi {

    private final List<HesaplamaObjesi> hesaplamalar;


    public HesapMakinesi() {
        this.hesaplamalar = new ArrayList<>();
        this.hesaplamalar.add(new HesaplamaObjesi("toplama",
                                                  new ToplamaHesaplama()));
        this.hesaplamalar.add(new HesaplamaObjesi("cikarma",
                                                  new CikarmaHesaplama()));
        this.hesaplamalar.add(new HesaplamaObjesi("carpma",
                                                  new CarpmaHesaplama()));
        this.hesaplamalar.add(new HesaplamaObjesi("bolme",
                                                  new BolmeHesaplama()));
        this.hesaplamalar.add(new HesaplamaObjesi("kare",
                                                  new KareHesaplama()));
        this.hesaplamalar.add(new HesaplamaObjesi("logaritma",
                                                  new logaritmikHesaplama()));
        this.hesaplamalar.add(new HesaplamaObjesi("üçlü toplama",
                                                  new ÜçlüToplamaHesaplama()));
    }

    private void menuGoster() {
        int index = 1;
        for (HesaplamaObjesi hesaplamaObjesiLoc : this.hesaplamalar) {
            System.out.println(index + "-" + hesaplamaObjesiLoc.getIslemIsmi());
            index++;
        }
        System.out.println(index + "-Cikis");
    }

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
