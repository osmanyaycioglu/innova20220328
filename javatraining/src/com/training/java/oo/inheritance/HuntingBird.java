package com.training.java.oo.inheritance;

// yazılımı tamamlanmamış class -> abstract
public abstract class HuntingBird extends Bird {

    private String birdName;
    
    public HuntingBird(int weightParam,
                       int heightParam,
                       String wordParam,
                       String birdNameParam) {
        super(weightParam,
              heightParam,
              wordParam);
        birdName = birdNameParam;
    }
    
    public void hunt() {
        System.out.println(birdName + " is hunting at " + huntAlt(200)  + " alt and hunted : " + huntResult());
    }
    
    // yazılımı olmayan method
    public abstract int huntResult();
    
    public abstract int huntAlt(int altLimit);

}
