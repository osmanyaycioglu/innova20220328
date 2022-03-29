package com.training.java.lab.calculator;


public class HesapMakinasi {

    private IslemGecmisi[] islemGecmisleri = new IslemGecmisi[10];
    private int            index           = 0;

    public double topla(double val1,
                        double val2) {
        double sonuc = val1 + val2;
        islemGecmisineEkle(val1,
                           val2,
                           sonuc,
                           1,
                           val1 + " ile " + val2 + " toplamı " + sonuc + " eder.");
        return sonuc;
    }

    public IslemGecmisi[] son10Islem() {
        IslemGecmisi[] donus = new IslemGecmisi[10];
        int indexGeri = index - 1;
        if (indexGeri < 10) {
            int donusIndexi = 0;
            for (int iLoc = indexGeri; iLoc >= 0; iLoc--) {
                donus[donusIndexi] = islemGecmisleri[iLoc];
                donusIndexi++;
            }
        } else {
            int donusIndexi = 0;
            for (int iLoc = 0; iLoc < 10; iLoc++) {
                int point = indexGeri - iLoc;
                point = point % 10;
                donus[donusIndexi] = islemGecmisleri[point];
                donusIndexi++;
            }
        }
        return donus;
    }
    
    private void islemGecmisineEkle(double val1,
                                    double val2,
                                    double sonuc,
                                    int islem,
                                    String aciklama) {
        IslemGecmisi islemGecmisiLoc = new IslemGecmisi();
        islemGecmisiLoc.setVal1(val1);
        islemGecmisiLoc.setVal2(val2);
        islemGecmisiLoc.setSonuc(sonuc);
        islemGecmisiLoc.setIslem(islem);
        islemGecmisiLoc.setAciklama(aciklama);
        int yer = index % 10;
        islemGecmisleri[yer] = islemGecmisiLoc;
        index++;
    }

    public double cikar(double val1,
                        double val2) {
        double sonuc = val1 - val2;
        islemGecmisineEkle(val1,
                           val2,
                           sonuc,
                           2,
                           val1 + " ile " + val2 + " çıkarımı " + sonuc + " eder.");
        return sonuc;
    }

    public double carp(double val1,
                       double val2) {
        double sonuc = val1 * val2;
        islemGecmisineEkle(val1,
                           val2,
                           sonuc,
                           3,
                           val1 + " ile " + val2 + " çarpımı " + sonuc + " eder.");
        return sonuc;
    }

    public double bol(double val1,
                      double val2) {
        if (val2 == 0D) {
            return 0D;
        }
        double sonuc = val1 / val2;
        islemGecmisineEkle(val1,
                           val2,
                           sonuc,
                           3,
                           val1 + " ile " + val2 + " bölümü " + sonuc + " eder.");
        return sonuc;
    }

}
