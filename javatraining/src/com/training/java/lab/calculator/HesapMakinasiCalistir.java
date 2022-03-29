package com.training.java.lab.calculator;


public class HesapMakinasiCalistir {

    public static void main(final String[] args) {
        HesapMakinasi hesapMakinasi = new HesapMakinasi();
        double sonucLoc = hesapMakinasi.carp(1,
                                             2);
        sonucLoc = hesapMakinasi.topla(3,
                                       4);
        sonucLoc = hesapMakinasi.cikar(6,
                                       5);
        sonucLoc = hesapMakinasi.carp(7,
                                      9);
        sonucLoc = hesapMakinasi.topla(30,
                                       40);
        sonucLoc = hesapMakinasi.cikar(61,
                                       51);
        sonucLoc = hesapMakinasi.carp(11,
                                      21);
        sonucLoc = hesapMakinasi.topla(33,
                                       44);
        sonucLoc = hesapMakinasi.cikar(66,
                                       55);
        sonucLoc = hesapMakinasi.carp(13,
                                      23);
        sonucLoc = hesapMakinasi.topla(34,
                                       45);
        sonucLoc = hesapMakinasi.cikar(69,
                                       58);
        sonucLoc = hesapMakinasi.carp(17,
                                      2);
        IslemGecmisi[] son10IslemLoc = hesapMakinasi.son10Islem();
        for (int iLoc = 0; iLoc < son10IslemLoc.length; iLoc++) {
            System.out.println(son10IslemLoc[iLoc].getAciklama());
        }


    }
}
