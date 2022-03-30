package com.training.java.constructor;


public class Person {

    // Field larım
    private String name;
    private String surname;
    private Integer weight;
    private Integer height = 100;

    // Constructor larım
    public Person() {
    }

    public Person(String nameParam,
                  String surnameParam) {
        name = nameParam;
        surname = surnameParam;
    }

    public Person(String nameParam,
                  String surnameParam,
                  Integer weightParam,
                  Integer heightParam) {
        name = nameParam;
        surname = surnameParam;
        weight = weightParam;
        height = heightParam;
    }

    public Person(String nameParam,
                  String surnameParam,
                  Integer heightParam) {
        name = nameParam;
        surname = surnameParam;
        height = heightParam;
    }


    // Method larım
    public String getName() {
        return name;
    }

    public void setName(String nameParam) {
        name = nameParam;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surnameParam) {
        surname = surnameParam;
    }

    public Integer getWeight() {
        return weight;
    }
    
    public void setWeight(Integer weightParam) {
        weight = weightParam;
    }
    
    public Integer getHeight() {
        return height;
    }
    
    public void setHeight(Integer heightParam) {
        height = heightParam;
    }
}
