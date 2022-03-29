package com.training.java.specs;


public class LoopSpecs {
    public static void main(String[] args) {
        
        for (int iLoc = 0; iLoc <= 12; iLoc = iLoc + 2) { 
            System.out.println("Loop : " + iLoc);
        }
        
        int j = 0;
        while (j <= 12) {
            System.out.println("Loop while : " + j);
            j += 2;
        }
        
        int x = 0;
        do {
            System.out.println("Loop do-while : " + x);
            x += 2;
        } while (x<=12);

        int a = 0;
        int b = 0;
        loop1:while (a <= 10) {
            a++;
            b = 0;
            loop2:while (b <=10) {
                System.out.println("Garip Loop while : " + a + "-" + b);
                if (b >= 5) {
                    continue loop1;
                }
                b++;
            }
        }
       
    }
}
