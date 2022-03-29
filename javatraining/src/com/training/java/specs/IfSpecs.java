package com.training.java.specs;


public class IfSpecs {

    public static void main(final String[] args) {
        int a = 9;
        int b = 10;
        int c = 11;

        if (a > 8) {
            System.out.println("a 8 den büyük");
        }
        if (a >= 8) {
            System.out.println("a 8 yada 8 den büyük");
        }
        if ((a > 8) && (b > 8) && (c > 8)) {
            System.out.println("a 8 den büyük ve b 8 büyük ve c sekizden büyük");
        }
        if (a > 8) {
            if (b > 8) {
                if (c > 8) {
                    System.out.println("a 8 den büyük ve b 8 büyük ve c sekizden büyük");
                }
            }
        }
        // AND Case
        //        C1      C2     Result
        //        0       0       0
        //        0       1       0
        //        1       0       0
        //        1       1       1

        if ((a > 8) || (b > 8) || (c > 8)) {
            System.out.println("a 8 den büyük yada b 8 büyük yada c sekizden büyük");
        }
        // OR Case
        //        C1      C2     Result
        //        0       0       0
        //        0       1       1
        //        1       0       1
        //        1       1       1
        if (((a > 8) && (b > 8)) || (c > 8)) {
            System.out.println("a 8 den büyük yada b 8 büyük yada c sekizden büyük");
        }

        if ((a > ((8 * 2) + 8)) && ((b > 8) || (c > 8))) {
            System.out.println("a 8 den büyük yada b 8 büyük yada c sekizden büyük");
        } else if (a < 8) {
            System.out.println("a 8 den küçük");
        } else if (b < 8) {
            System.out.println("b 8 den küçük");
        } else {
            System.out.println("hiçbiri");
        }

    }
}
