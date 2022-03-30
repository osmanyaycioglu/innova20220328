package com.training.java.oo.inheritance;


public class Hawk extends HuntingBird {

    public Hawk() {
        super(1,
              70,
              "kiiiik",
              "Hawk");
    }

    @Override
    public int huntResult() {
        return 3;
    }

    @Override
    public int huntAlt(int altLimitParam) {
        return altLimitParam-10;
    }

}
