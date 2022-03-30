package com.training.java.oo.abstraction;


public class NewAnimalEx implements IAnimal,IBeing {

    @Override
    public void walk() {
        System.out.println("I am walking ex");
    }

    @Override
    public void talk() {
        System.out.println("I am talking ex");
    }

    @Override
    public void eat() {
        System.out.println("I am eating ex");
    }

    @Override
    public void sleep() {
        System.out.println("I am sleeping ex");
    }

}
