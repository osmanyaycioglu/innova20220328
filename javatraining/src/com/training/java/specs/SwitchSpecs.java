package com.training.java.specs;


public class SwitchSpecs {

    public static void main(final String[] args) {
        int a = 6;
        String caseStr = "";
        switch (a) {
            case 1:
                System.out.println("Bu bir 1");
            case 2:
                System.out.println("Bu bir 2");
                break;
            case 3:
                System.out.println("Bu bir 3");
            case 4:
                caseStr += "4,";
            case 5:
                caseStr += "5,";
            case 6:
                caseStr += "6";
                System.out.println("Bu bunlardan biri " + caseStr);
                break;
            default:
                System.out.println("Bu hiçbiri 1,2,3,4 bunlardan değil");
                break;
        }

        String str = "ali";
        switch (str) {
            case "ali":
                System.out.println("ali yi buldum");
                break;
            case "veli":
                System.out.println("veli yi buldum");
                break;
            case "osman":
                System.out.println("osmanı buldum");
                break;

            default:
                break;
        }

    }
}
