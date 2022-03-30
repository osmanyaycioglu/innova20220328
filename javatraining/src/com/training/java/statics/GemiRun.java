package com.training.java.statics;

import java.nio.file.Files;

public class GemiRun {
    public static void main(String[] args) {
        String stringLoc = "osman";
        Gemi gemi1 = new Gemi("adana", 50);
        Gemi gemi2 = new Gemi("izmir", 60);
        Gemi gemi3 = new Gemi("ankara", 60);
        Gemi.checkGemi(gemi3);
        Gemi.generalLevelCount = 6;
        gemi1.forward(2);
        gemi2.forward(3);
        gemi3.forward(1);
        gemi1.forward(1);
        gemi2.forward(2);
        gemi2.forward(2);
        gemi3.forward(1);
        System.out.println("Forward count : " + Gemi.forwardCount);
        if (StringUtil.isEmpty(stringLoc)) {
            System.out.println("boş");
        }
        String concatLoc = StringUtil.concat(false,"osman","yaycıoğlu","java","öğretmeni","mart","2022");
        System.out.println(concatLoc);
        
    }
}
