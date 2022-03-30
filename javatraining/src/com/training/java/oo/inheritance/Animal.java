package com.training.java.oo.inheritance;


public class Animal {

    private int    weight;
    private int    height;
    private String word;


    public Animal(int weightParam,
                  int heightParam,
                  String wordParam) {
        super();
        weight = weightParam;
        height = heightParam;
        word = wordParam;
    }

    public Animal(int weightParam,
                  int heightParam) {
        super();
        weight = weightParam;
        height = heightParam;
        word = "wooow";
    }

    public void walk() {
        System.out.println("I am walking");
    }

    public void talk() {
        System.out.println(word);
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weightParam) {
        weight = weightParam;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int heightParam) {
        height = heightParam;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String wordParam) {
        word = wordParam;
    }
}
