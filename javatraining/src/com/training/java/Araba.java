package com.training.java;


public class Araba {

    private int    currentSpeed = 0;
    private int    topSpeed = 100;
    private String model = "unknown";

    public Araba() {
    }


    boolean foward(final int deltaSpeed,
                   final int duration) {
        int calculatedSpeed = this.currentSpeed + deltaSpeed;
        if (calculatedSpeed > this.topSpeed) {
            // true
            return false;
        } else {
            // false
            this.currentSpeed = calculatedSpeed;
            return true;
        }
    }

    void slowDown(final int deltaSpeed) {
        int calculatedSpeed = this.currentSpeed - deltaSpeed;
        if (calculatedSpeed >= 0) {
            this.currentSpeed = calculatedSpeed;
        } else {
            this.currentSpeed = 0;
        }
    }

    void stop() {
        this.currentSpeed = 0;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    //    public void setCurrentSpeed(final int currentSpeedParam) {
    //        if (currentSpeedParam > this.currentSpeed) {
    //            this.currentSpeed = this.topSpeed;
    //        } else {
    //            this.currentSpeed = currentSpeedParam;
    //        }
    //    }

    public int getTopSpeed() {
        return this.topSpeed;
    }

    public void setTopSpeed(final int topSpeedParam) {
        this.topSpeed = topSpeedParam;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(final String modelParam) {
        this.model = modelParam;
    }
}
