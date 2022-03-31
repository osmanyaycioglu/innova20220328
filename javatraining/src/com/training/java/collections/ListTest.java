package com.training.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(final String[] args) {
        String[] strArray = new String[10];
        strArray[5] = "osman";
        List<String> xyz = new ArrayList<>();
        for (int iLoc = 0; iLoc < 100; iLoc++) {
            xyz.add("index" + iLoc);
        }
        for (int iLoc = 50; iLoc < 60; iLoc++) {
            String stringLoc = xyz.get(iLoc);
            System.out.println(stringLoc);
        }
        System.out.println("---------------------");
        for (String abc : xyz) {
            System.out.println(abc);
            // kod
        }
    }
}
