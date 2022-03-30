package com.training.java.oo.abstraction;


public class NewBirdEx extends NewAnimal implements IBird {

    @Override
    public void fly() {
        System.out.println("I am flying");
    }

}
