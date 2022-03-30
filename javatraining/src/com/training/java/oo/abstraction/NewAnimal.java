package com.training.java.oo.abstraction;


public class NewAnimal implements IAnimal,IBeing {

    @Override
    public void walk() {
        System.out.println("I am walking");
    }

    @Override
    public void talk() {
        System.out.println("I am talking");
    }

    @Override
    public void eat() {
        System.out.println("I am eating");
    }

    @Override
    public void sleep() {
        System.out.println("I am sleeping");
    }

}
