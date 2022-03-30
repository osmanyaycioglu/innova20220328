package com.training.java.constructor;


public class ConsRunner {
    public static void main(String[] args) {
        Person  personLoc = new Person("osman","yaycıoğlu");
        Person  personLoc2 = new Person("osman","yaycıoğlu",200);
        Person  personLoc3 = new Person("osman","yaycıoğlu",95,200);
        Person  personLoc4 = new Person();
        
        
        ImmutablePerson immutablePerson = new ImmutablePerson("osman","yaycıoğlu",95,200);
        // personLoc.setSurname("yaycıoğlu");
        
        String str = "osman"; // immutable
        str += " yaycıoğlu";
        String newStr = str.concat(" yaycıoğlu");
        
        System.out.println(newStr);
        
        // NotNewableObject newableObjectLoc = new NotNewableObject(); 
    }
}
