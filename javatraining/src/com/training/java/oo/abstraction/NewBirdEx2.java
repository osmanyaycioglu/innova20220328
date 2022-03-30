package com.training.java.oo.abstraction;


public class NewBirdEx2 extends NewAnimal implements IBird {

    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void walk() {
        System.out.println("yürüyorum");
    }
    
    @Override
    public void talk() {
        System.out.println("konuşuyorum");
    }
    
}
