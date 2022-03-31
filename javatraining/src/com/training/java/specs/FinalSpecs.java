package com.training.java.specs;

import com.training.java.Araba;

// Artık extend edilemez
public final class FinalSpecs {

    // yaratıktan sonra değiştirilemez
    private final String  name;
    private final Integer height;

    public FinalSpecs(final String nameParam, // Artık bu referansı başka instance a atamazsınız (Best practice)
                      final Integer heightParam) {
        super();
        this.name = nameParam;
        this.height = heightParam;
    }

    public String getName() {
        return this.name;
    }

    public Integer getHeight() {
        return this.height;
    }

    // Override edilemez
    public final void finalMethod() {

    }

    public void xyz(final Araba arabaParam) {
        // code
        // arabaParam = new Araba();
        // code
    }

    public static final int SYSTEM_STATE_STARTING = 1;
    public static final int SYSTEM_STATE_BOOTING  = 2;
    public static final int SYSTEM_STATE_RUNNING  = 3;
    public static final int SYSTEM_STATE_STOPPED  = 4;

    public static void main(final String[] args) {
        final int systemState = FinalSpecs.SYSTEM_STATE_STARTING;
        int b = 2;
        if (b == 2) {
            System.out.println("hello");
        }
        final Araba arabaLoc = new Araba();
        arabaLoc.setModel("test");
        switch (systemState) {
            case SYSTEM_STATE_STARTING:
                System.out.println("STARTING");
                break;
            case SYSTEM_STATE_BOOTING:
                System.out.println("BOOTING");
                break;
            case SYSTEM_STATE_RUNNING:
                System.out.println("RUNNING");
                break;
            case SYSTEM_STATE_STOPPED:
                System.out.println("STOPPED");
                break;

            default:
                break;
        }
    }


}
