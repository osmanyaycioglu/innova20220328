package com.training.java.statics;


public class Gemi {
    
    private String name;
    private int topSpeed;
    private int currentSpeed;
    
    public static int generalLevelCount = 3;
    
    public static int forwardCount = 0;
 
    public Gemi(String nameParam,
                int topSpeedParam) {
        name = nameParam;
        topSpeed = topSpeedParam;
    }

    private void testLocal() {
        System.out.println("private test local");
    }
    
    public static String checkGemi(Gemi gemi) {
        gemi.testLocal();
        gemi.name = "test";
        gemi.topSpeed=150;
        return "Gemi değiştirildi";
    }
    
    public void forward(int speedLevel) {
        forwardCount++;
        System.out.println(name  + " General level count : " + generalLevelCount);
        switch (speedLevel) {
            case 1:
                currentSpeed = 10;
                break;
            case 2:
                currentSpeed = 20;
                break;
            case 3:
                currentSpeed = 30;
                break;
            default:
                break;
        }
    }

    
    public String getName() {
        return name;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
    
    
}
