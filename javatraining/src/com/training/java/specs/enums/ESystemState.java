package com.training.java.specs.enums;


public enum ESystemState {

    STARTING("sistemi başlatıyorum", 10),
    BOOTING("sistemi boot ediyorum", 20),
    RUNNING("sistem çalışıyor", 30),
    STOPPED("sistem durdu", 40);

    private final String  descString;
    private final Integer total;

    private ESystemState(final String descStringParam,
                         final Integer total) {
        this.descString = descStringParam;
        this.total = total;
    }

    public String getDescString() {
        return this.descString;
    }

    public Integer getTotal() {
        return this.total;
    }

    public boolean isStateOK(final int value) {
        return value < this.total;
    }
}
