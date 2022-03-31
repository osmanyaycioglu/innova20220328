package com.training.java.oo.inheritance;


public class Animal {

    private int      weight;
    int              height;
    protected String word;


    public Animal(final int weightParam,
                  final int heightParam,
                  final String wordParam) {
        super();
        this.weight = weightParam;
        this.height = heightParam;
        this.word = wordParam;
    }

    public Animal(final int weightParam,
                  final int heightParam) {
        super();
        this.weight = weightParam;
        this.height = heightParam;
        this.word = "wooow";
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
        System.out.println(this.word);
    }


    public int getWeight() {
        return this.weight;
    }

    public void setWeight(final int weightParam) {
        this.weight = weightParam;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(final int heightParam) {
        this.height = heightParam;
    }

    public String getWord() {
        return this.word;
    }

    public void setWord(final String wordParam) {
        this.word = wordParam;
    }
}
