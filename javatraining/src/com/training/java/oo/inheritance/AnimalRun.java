package com.training.java.oo.inheritance;


public class AnimalRun {

    public static void main(String[] args) {
        Animal animalLoc = new Bird(1, 50);
        animalLoc.word = "test";
        animalLoc.height = 90;
        animalLoc.testPackagePrivate();
        animalLoc.walk();
        animalLoc.talk();
        animalLoc.testProtected();
        
        System.out.println("-----------------------");
        
        Bird bird = new Bird(1,50);
        bird.walk();
        bird.talk();
        bird.fly();
        
        Animal birdAnimal = new Bird(1, 50);
        
        birdAnimal.walk();
        birdAnimal.talk();
        
        System.out.println("-----------------------");
        
        Pigeon pigeon = new Pigeon();
        pigeon.walk();
        pigeon.talk();
        pigeon.fly();
       
        
        System.out.println("-----------------------");
        
        Eagle eagle = new Eagle();
        eagle.walk();
        eagle.talk();
        eagle.fly();
        eagle.hunt();
        
        System.out.println("-----------------------");
        
        Hawk hawk = new Hawk();
        hawk.walk();
        hawk.talk();
        hawk.fly();
        hawk.hunt();
        
        Bird hawkAnimal = new Hawk();
        hawkAnimal.fly();
        
                
    }
}
