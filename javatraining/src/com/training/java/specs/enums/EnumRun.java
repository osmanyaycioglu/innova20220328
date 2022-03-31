package com.training.java.specs.enums;


public class EnumRun {

    public static void main(final String[] args) {
        ESystemState systemState = ESystemState.RUNNING;
        switch (systemState) {
            case BOOTING:
                System.out.println(systemState.toString() + " : " + systemState.getDescString());
                break;
            case RUNNING:
                System.out.println(systemState.toString() + " : " + systemState.getDescString());
                break;
            case STARTING:
                System.out.println(systemState.toString() + " : " + systemState.getDescString());
                break;
            case STOPPED:
                System.out.println(systemState.toString() + " : " + systemState.getDescString());
                break;
            default:
                break;
        }
        boolean stateOKLoc = systemState.isStateOK(9);
    }
}
