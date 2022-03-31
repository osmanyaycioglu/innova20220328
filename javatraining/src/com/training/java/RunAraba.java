package com.training.java;


public class RunAraba {


    public static void main(final String[] args) {
        System.out.println("Arabayı yaratıyorum");
        Araba araba = new Araba();
        araba.setTopSpeed(180);
        araba.setModel("BMW");
        System.out.println("Araba yaratıldı " + (araba == null ? "null" : araba.toString()));
        System.out.println("Araba yaratıldı " + araba);

        Araba araba2 = new Araba();
        araba2.setTopSpeed(300);
        araba2.setModel("Ferro");
        Araba araba3 = new Araba();
        Araba araba4 = new Araba();
        Araba araba5 = new Araba();


        System.out.println("Araba 1 20 km ile ileri git");
        boolean result1 = araba.foward(20,
                                       10);
        System.out.println("Araba 1 forward Eylem 1 sonucu : "
                           + result1
                           + " currentSpeed : "
                           + araba.getCurrentSpeed());
        boolean result2 = araba.foward(120,
                                       10);
        System.out.println("Araba 1 forward Eylem 2 sonucu : "
                           + result2
                           + " currentSpeed : "
                           + araba.getCurrentSpeed());
        boolean result3 = araba.foward(120,
                                       10);
        System.out.println("Araba 1 forward Eylem 3 sonucu : "
                           + result3
                           + " currentSpeed : "
                           + araba.getCurrentSpeed());
        araba.slowDown(10);
        System.out.println("Araba 1 slowDown Eylem 4 currentSpeed : " + araba.getCurrentSpeed());
        araba.slowDown(10);
        System.out.println("Araba 1 slowDown Eylem 5 currentSpeed : " + araba.getCurrentSpeed());
        araba.stop();
        System.out.println("Araba 1 stop Eylem 6 currentSpeed : " + araba.getCurrentSpeed());

        System.out.println("-------------TEA------------------");
        TeaMachine abc = new TeaMachine();
        abc.setLevel1Time(10);
        abc.setLevel2Time(15);
        abc.setLevel3Time(20);

        abc.prepareTeaFirst(2);
        System.out.println("-------------!TEA!------------------");

        System.out.println("-------------TEA Second------------------");
        TeaMachine second = new TeaMachine();
        // second.levels = new int[3];
        second.changeLevel(0,
                           10);
        second.changeLevel(1,
                           15);
        second.changeLevel(2,
                           20);
        second.prepareTeaSecond(5);
        System.out.println("-------------!TEA!------------------");


        System.out.println("Araba 2 20 km ile ileri git");
        result1 = araba2.foward(20,
                                10);
        System.out.println("Araba 2 Eylem 1 sonucu : " + result1);
        result2 = araba2.foward(120,
                                10);
        System.out.println("Araba 2 Eylem 2 sonucu : " + result2);
        result3 = araba2.foward(120,
                                10);
        System.out.println("Araba 2 Eylem 3 sonucu : " + result3);

        System.out.println("Araba 3 20 km ile ileri git");
        result1 = araba3.foward(20,
                                10);
        System.out.println("Araba 3 Eylem 1 sonucu : " + result1);
        result2 = araba3.foward(120,
                                10);
        System.out.println("Araba 3 Eylem 2 sonucu : " + result2);
        result3 = araba3.foward(120,
                                10);
        System.out.println("Araba 3 Eylem 3 sonucu : " + result3);

    }


}
