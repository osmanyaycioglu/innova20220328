package com.training.java.constructor;


public class Person {

    // Field larım
    private String  name;
    private String  surname;
    private Integer weight;
    private Integer height = 100;

    // Constructor larım
    public Person() {
    }

    public Person(final String nameParam,
                  final String surnameParam) {
        this.name = nameParam;
        this.surname = surnameParam;
    }

    public Person(final String nameParam,
                  final String surnameParam,
                  final Integer weightParam,
                  final Integer heightParam) {
        this.name = nameParam;
        this.surname = surnameParam;
        this.weight = weightParam;
        this.height = heightParam;
    }

    public Person(final String nameParam,
                  final String surnameParam,
                  final Integer heightParam) {
        this.name = nameParam;
        this.surname = surnameParam;
        this.height = heightParam;
    }


    // Method larım
    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(final Integer weightParam) {
        this.weight = weightParam;
    }

    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(final Integer heightParam) {
        this.height = heightParam;
    }

    @Override
    public String toString() {
        return "Person [name="
               + this.name
               + ", surname="
               + this.surname
               + ", weight="
               + this.weight
               + ", height="
               + this.height
               + "]";
    }

}
