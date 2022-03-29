package com.training.java.specs;

import com.training.java.Araba;

public class OperatorsSpecs {

    public static void main(final String[] args) { // Stack
        int value1 = (10 * 20) + 100;
        Araba xyz = null;
        Araba araba = new Araba(); // Heap
        Araba otherAraba = araba;
        Araba maraba = araba;
        xyz = new Araba();
        araba = new Araba();
        maraba = null;
        otherAraba = null;

        int value2 = 10;
        value2 = value2 + 10;
        value2 += 10;
        value2 = value2 + (10 - ((3 * 4) / 2));
        value2 *= 3;
        value2 -= 20;
        value2 /= 2;

        int value3 = 103;
        int value4 = value3 % 5;
        System.out.println("Value4 sonucu : " + value4);

    }
}
