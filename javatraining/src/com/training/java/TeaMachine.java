package com.training.java;

public class TeaMachine {

    // First
    private int level1Time = 5;
    private int level2Time = 10;
    private int level3Time = 20;

    // Second
    //int[] levels = new int[3];
    private final int[] levels;

    public TeaMachine() {
        this.levels = new int[3];
        this.level1Time = 7;
        this.level2Time = 14;
        this.level3Time = 21;
    }

    public void changeLevel(final int index,
                            final int newValue) {
        if (index > (this.levels.length - 1)) {
            return;
        }
        this.levels[index] = newValue;
    }

    public boolean prepareTeaSecond(final int level) {
        return this.prepare(level);
    }

    private boolean prepare(final int level) {
        if (level > this.levels.length) {
            System.out.println("Not supported level : " + level);
            return false;
        }
        System.out.println("Level " + level + " tea : " + this.levels[level - 1]);
        return true;
    }

    public boolean prepareTeaFirst(final int level) {
        switch (level) {
            case 1:
                System.out.println("Level 1 tea : " + this.level1Time);
                return true;
            case 2:
                System.out.println("Level 2 tea : " + this.level2Time);
                return true;
            case 3:
                System.out.println("Level 3 tea : " + this.level3Time);
                return true;
            default:
                System.out.println("Not supported level : " + level);
                return false;
        }
    }

    public boolean prepareTeaOld(final int level) {
        if (level == 1) {
            System.out.println("Level 1 tea : " + this.level1Time);
            return true;
        } else if (level == 2) {
            System.out.println("Level 2 tea : " + this.level2Time);
            return true;
        } else if (level == 3) {
            System.out.println("Level 3 tea : " + this.level3Time);
            return true;
        } else {
            System.out.println("Not supported level : " + level);
            return false;
        }
    }


    public int getLevel1Time() {
        return this.level1Time;
    }


    public void setLevel1Time(final int level1TimeParam) {
        this.level1Time = level1TimeParam;
    }


    public int getLevel2Time() {
        return this.level2Time;
    }


    public void setLevel2Time(final int level2TimeParam) {
        if (level2TimeParam > this.level1Time) {
            this.level2Time = level2TimeParam;
        } else {
            this.level2Time = this.level1Time + 5;
        }
    }


    public int getLevel3Time() {
        return this.level3Time;
    }


    public void setLevel3Time(final int level3TimeParam) {
        this.level3Time = level3TimeParam;
    }

}
