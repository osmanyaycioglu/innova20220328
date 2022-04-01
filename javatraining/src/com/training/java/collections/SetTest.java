package com.training.java.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(final String[] args) {
        Set<String> setLoc = new TreeSet<>();
        setLoc.add("101");
        setLoc.add("101");
        setLoc.add("102");
        setLoc.add("102");
        setLoc.add("103");
        setLoc.add("103");
        setLoc.add("100");
        setLoc.add("100");
        setLoc.add("100");
        setLoc.add("100");
        setLoc.add("100");
        setLoc.add("100");
        setLoc.add("100");
        setLoc.add("100");
        setLoc.add("100");
        setLoc.add("101");
        System.out.println(setLoc);

        for (String stringLoc : setLoc) {
            System.out.println("set 1 : " + stringLoc);
        }

        Set<String> set2Loc = new TreeSet<>();
        set2Loc.add("102");
        set2Loc.add("103");
        set2Loc.add("104");
        set2Loc.add("105");
        set2Loc.add("106");
        System.out.println(set2Loc);
        set2Loc.retainAll(setLoc);
        System.out.println("---------Kesişim------------");
        System.out.println(set2Loc);

        Set<String> set3Loc = new TreeSet<>();
        set3Loc.add("102");
        set3Loc.add("103");
        set3Loc.add("104");
        set3Loc.add("105");
        set3Loc.add("106");
        set3Loc.addAll(setLoc);
        System.out.println("---------Toplamı------------");
        System.out.println(set3Loc);

        Set<String> set4Loc = new TreeSet<>();
        set4Loc.add("102");
        set4Loc.add("103");
        set4Loc.add("104");
        set4Loc.add("105");
        set4Loc.add("106");
        set4Loc.removeAll(setLoc);
        System.out.println("---------Çıkarımı------------");
        System.out.println(set4Loc);

    }
}
