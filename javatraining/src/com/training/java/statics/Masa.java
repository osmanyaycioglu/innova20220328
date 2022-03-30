package com.training.java.statics;


public class Masa {

    private String model;
    private int    height;

    private Masa(String modelParam,
                int heightParam) {
        model = modelParam;
        height = heightParam;
    }
    
    
    public static Masa createMasa(String model,
                                  int height) {
        return new Masa(model,
                        height);
    }

    public static Masa createRustikMasa(int height) {
        return new Masa("rustik",
                        height);
    }

    public static Masa createModernMasa(int height) {
        return new Masa("modern",
                        height);
    }

}
