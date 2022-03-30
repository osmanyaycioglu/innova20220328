package com.training.java.lab.pizza;


public class Malzeme {
    private String name;
    private int fiyat;
    
    public Malzeme(String nameParam,
                   int fiyatParam) {
        super();
        name = nameParam;
        fiyat = fiyatParam;
    }

    public String getName() {
        return name;
    }
    
    public int getFiyat() {
        return fiyat;
    }
}
