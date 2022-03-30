package com.training.java.oo.inheritance;


public class Bird extends Animal {

    public Bird(int weightParam,
                int heightParam) {
        super(weightParam,
              heightParam,
              "cikcik");
    }

    public Bird(int weightParam,
                int heightParam,
                String word) {
        super(weightParam,
              heightParam,
              word);
    }

    public void fly() {
        System.out.println("Bird is flying");
    }

}
