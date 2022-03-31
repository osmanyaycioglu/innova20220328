package com.training.java.exceptions;


public class ExceptionRun {

    public static void main(final String[] args) {
        FileRead fr = new FileRead();
        try {
            fr.readFile();
            return;
        } catch (MyFileException e) {
            e.printStackTrace();
        } catch (MyRuntimeException eLoc) {
            eLoc.printStackTrace();
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        } finally {
            System.out.println("Ne olursa olsun çalışırım");
        }

        try {
            fr.readFile();
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }

        try {
            fr.readFile();
        } catch (MyFileException | MyRuntimeException eLoc) {
            eLoc.printStackTrace();
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }

        System.out.println("Burayı görmeyeceksiniz");
    }

}
