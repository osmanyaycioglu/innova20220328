package com.training.java.oo.abstraction;


public class AbstractionRun {
    public static void main(String[] args) {
        IAnimal animalLoc = new NewBirdEx2();

        // Kodlarım
        animalLoc.talk();
        animalLoc.walk();
    }
}
