package com.training.java.oo.inheritance;


public class Pigeon extends Bird {

    public Pigeon() {
        super(1,
              50,
              "guguk");
    }

    @Override
    public void fly() {
        System.out.println("Pigeon is flying");
        super.fly();
    }

    @Override
    public void walk() {
        System.out.println("Pigeon is walking");
    }
}
