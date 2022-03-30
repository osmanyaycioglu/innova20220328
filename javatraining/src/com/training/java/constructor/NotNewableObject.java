package com.training.java.constructor;


public class NotNewableObject {
    
    private String name;

    private NotNewableObject() {
    }
    
    public String getName() {
        return name;
    }

    
    public void setName(String nameParam) {
        name = nameParam;
    }
    
    
}
