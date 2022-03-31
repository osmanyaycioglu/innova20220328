package com.training.java.exceptions;


public class MyRuntimeException extends RuntimeException {

    private static final long serialVersionUID = 6472063961777922864L;

    public MyRuntimeException(final String message) {
        super(message);
    }

}
