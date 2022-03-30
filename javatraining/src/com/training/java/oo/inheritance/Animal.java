package com.training.java.oo.inheritance;


public class Animal {

    private int      weight;
    int              height;
    protected String word;


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

    protected void testProtected() {
        System.out.println("protected run");
    }
    
    void testPackagePrivate() {
        System.out.println("PackagePrivate run");
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
