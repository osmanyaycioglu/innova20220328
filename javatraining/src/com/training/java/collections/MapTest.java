package com.training.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.training.java.lab.pizza.BuyukPizza;
import com.training.java.lab.pizza.KucukPizza;
import com.training.java.lab.pizza.Pizza;

public class MapTest {

    public static void main(final String[] args) {
        Map<String, Integer> mapLoc = new HashMap<>();
        mapLoc.put("osman",
                   1970);
        mapLoc.put("ali",
                   1972);
        mapLoc.put("veli",
                   1980);
        mapLoc.put("osman",
                   1991);
        System.out.println(mapLoc);
        Integer integerLoc = mapLoc.get("veli");

        Map<String, Pizza> map2Loc = new HashMap<>();
        map2Loc.put("buyuk-standart1",
                    new BuyukPizza().malzemeEkle("zeytin")
                                    .malzemeEkle("mantar")
                                    .malzemeEkle("sucuk"));

        map2Loc.put("kucuk-standart2",
                    new KucukPizza().malzemeEkle("zeytin")
                                    .malzemeEkle("mantar")
                                    .malzemeEkle("sucuk"));

        Pizza pizzaLoc = map2Loc.get("buyuk-standart1");
        System.out.println(pizzaLoc);

        Set<String> keySetLoc = mapLoc.keySet();
        for (String keyLoc : keySetLoc) {
            System.out.println("Map : " + keyLoc + "-->" + mapLoc.get(keyLoc));
        }

        System.out.println("-------------");
        Collection<Integer> valuesLoc = mapLoc.values();
        for (Integer valueLoc : valuesLoc) {
            System.out.println("Values : " + valueLoc);
        }

        Set<Entry<String, Integer>> entrySetLoc = mapLoc.entrySet();
        for (Entry<String, Integer> entryLoc : entrySetLoc) {
            System.out.println("Key : " + entryLoc.getKey() + "-->" + entryLoc.getValue());
        }
    }
}
