package com.training.java.lab.calculator2;

import java.util.Scanner;

public class HesapRun {

    public void runMe() {
        try (Scanner scannerLoc = new Scanner(System.in)) {
            EHesapmakinasiTipi[] valuesLoc = EHesapmakinasiTipi.values();
            for (int iLoc = 0; iLoc < valuesLoc.length; iLoc++) {
                System.out.println((iLoc + 1) + "." + valuesLoc[iLoc].toString());
            }
            System.out.println("Seçiminiz : ");
            int nextIntLoc = scannerLoc.nextInt();
            EHesapmakinasiTipi eHesapmakinasiTipiLoc = valuesLoc[nextIntLoc - 1];
            IHesapMakinasi hesapMakinesiLoc = HesapMakinesiFabrikasi.createHesapMakinasi(scannerLoc,
                                                                                         eHesapmakinasiTipiLoc);
            hesapMakinesiLoc.hesapMakinasiCalistir();
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }

    public static void main(final String[] args) {
        HesapRun hesapRunLoc = new HesapRun();
        hesapRunLoc.runMe();
    }
}
