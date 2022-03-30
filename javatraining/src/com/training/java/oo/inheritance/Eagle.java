package com.training.java.oo.inheritance;


public class Eagle extends HuntingBird {

    public Eagle() {
        super(2,
              120,
              "viiiikk",
              "Eagle");
    }

    @Override
    public int huntResult() {
        return 5;
    }

    @Override
    public int huntAlt(int altLimitParam) {
        return altLimitParam;
    }


}
