package com.training.java.collections;

import java.util.ArrayList;
import java.util.List;

import com.training.java.lab.pizza.BuyukPizza;
import com.training.java.lab.pizza.KucukPizza;
import com.training.java.lab.pizza.OrtaPizza;
import com.training.java.lab.pizza.Pizza;

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
        System.out.println("---------------------");
        List<Pizza> pizzaListLoc = new ArrayList<>();
        pizzaListLoc.add(new BuyukPizza().malzemeEkle("zeytin")
                                         .malzemeEkle("mantar")
                                         .malzemeEkle("sucuk"));
        pizzaListLoc.add(new KucukPizza().malzemeEkle("zeytin")
                                         .malzemeEkle("mantar")
                                         .malzemeEkle("sucuk"));
        pizzaListLoc.add(new OrtaPizza().malzemeEkle("zeytin")
                                        .malzemeEkle("mantar")
                                        .malzemeEkle("sucuk"));
        if (pizzaListLoc.contains(new OrtaPizza().malzemeEkle("zeytin")
                                                 .malzemeEkle("mantar")
                                                 .malzemeEkle("sucuk"))) {
            System.out.println("Evet bu obje var");
        }
        System.out.println("---------------------");
        for (Pizza pizzaLoc : pizzaListLoc) {
            System.out.println(pizzaLoc.aciklama());
        }
    }
}
