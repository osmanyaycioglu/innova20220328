package com.training.java.specs;


public class DataTypes {

    public static void main(String[] args) {
        // primitives
        byte tam1 = (byte) 0xFF;
        short tam2 = 56;
        int tam3 = 10;
        long tam4 = 2000L;

        float kesir1 = 0.2F;
        double kesir2 = 0.4;

        // Objects
        Byte tam1o = 10;
        Short tam2o = 56;
        Integer tam3o = 10;
        Integer tam3on = null;
        Long tam4o = 2000L;
        
        Float kesir1o=0.2F;
        Double kesir2o = 0.4D;

        String str = "osman";

        System.out.println("Byte Max : " + Byte.MAX_VALUE + " Min : " + Byte.MIN_VALUE);
        System.out.println("Short Max : " + Short.MAX_VALUE + " Min : " + Short.MIN_VALUE);
        System.out.println("Integer Max : " + Integer.MAX_VALUE + " Min : " + Integer.MIN_VALUE);
        System.out.println("Long Max : " + Long.MAX_VALUE + " Min : " + Long.MIN_VALUE);
    }

}
