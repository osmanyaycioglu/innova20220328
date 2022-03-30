package com.training.java.oo.inheritance.test;

import com.training.java.oo.inheritance.Animal;

public class AnimalGen1 extends Animal {

    public AnimalGen1(int weightParam,
                      int heightParam) {
        super(weightParam,
              heightParam);
        word = "xyz";
        testProtected();
        //        height = 90; Ulaşılamaz -> Boş access modifier
        //        testPackagePrivate(); Ulaşılamaz -> Boş access modifier
    }

}
