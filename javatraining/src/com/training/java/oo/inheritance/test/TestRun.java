package com.training.java.oo.inheritance.test;

import com.training.java.oo.inheritance.Animal;
import com.training.java.oo.inheritance.Bird;

public class TestRun {
    public static void main(String[] args) {
        Animal animalLoc = new Bird(1, 50);
        // animalLoc.word = "test"; Ulaşılamaz -> protected access modifier
        // animalLoc.testProtected(); Ulaşılamaz -> protected access modifier
        // animalLoc.height = 90; Ulaşılamaz -> Boş access modifier 
        // animalLoc.testPackagePrivate(); Ulaşılamaz -> Boş access modifier
        animalLoc.walk();
        animalLoc.talk();
        
    }
}
