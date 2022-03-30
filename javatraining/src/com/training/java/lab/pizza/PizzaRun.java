package com.training.java.lab.pizza;


public class PizzaRun {
    public static void main(String[] args) {
        Pizza kucukPizzaLoc = new BuyukPizza();
        kucukPizzaLoc.malzemeEkle("zeytin");
        kucukPizzaLoc.malzemeEkle("mantar");
        kucukPizzaLoc.malzemeEkle("sucuk");
        kucukPizzaLoc.malzemeEkle("sucuk");
        kucukPizzaLoc.malzemeEkle("sosis");
        System.out.println(kucukPizzaLoc.aciklama());
        
    }
}
