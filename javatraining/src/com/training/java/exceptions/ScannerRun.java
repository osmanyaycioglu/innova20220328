package com.training.java.exceptions;

import java.util.Scanner;

public class ScannerRun {

    public static void main(final String[] args) {
        try (Scanner scannerXLoc = new Scanner(System.in)) {
            System.out.println("Bana bir rakam ver X : ");
            int nextIntLoc = scannerXLoc.nextInt();
            System.out.println("sonuç : " + (nextIntLoc * 10));
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }

        Scanner scannerLoc = null;
        try {
            scannerLoc = new Scanner(System.in);
            System.out.println("Bana bir rakam ver : ");
            int nextIntLoc = scannerLoc.nextInt();
            System.out.println("sonuç : " + (nextIntLoc * 10));

        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        } finally {
            if (scannerLoc != null) {
                scannerLoc.close();
            }
        }

    }
}
