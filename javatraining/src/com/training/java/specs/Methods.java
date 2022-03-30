package com.training.java.specs;


public class Methods {

    public static void multipleEntries(String... strs) {
        for (int iLoc = 0; iLoc < strs.length; iLoc++) {
            System.out.println(iLoc + "." + strs[iLoc]);
        }
    }
    
    
    public static void main(String[] args) {
        Methods.multipleEntries("deneme","1","2","3");
    }
}
