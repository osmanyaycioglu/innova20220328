package com.training.java.constructor;


public class ImmutablePerson {

    private String name;
    private String surname;
    private Integer weight;
    private Integer height;
    
    public ImmutablePerson(String nameParam,
                           String surnameParam,
                           Integer weightParam,
                           Integer heightParam) {
        name = nameParam;
        surname = surnameParam;
        weight = weightParam;
        height = heightParam;
    }

    public String getName() {
        return name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public Integer getWeight() {
        return weight;
    }
    
    public Integer getHeight() {
        return height;
    }
    
    
}
