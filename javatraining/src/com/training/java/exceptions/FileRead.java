package com.training.java.exceptions;

import java.io.File;

import com.training.java.Araba;

public class FileRead {

    private String fileName;

    public Araba readFile() throws MyFileException {
        if ((this.fileName == null) || this.fileName.isEmpty()) {
            throw new MyFileException("filename null olamaz");
        }
        if (this.fileName.length() < 3) {
            throw new MyRuntimeException("filename çok kısa");
        }
        try {
            byte[] readFileInternalLoc = this.readFileInternal();
        } catch (NullPointerException eLoc) {
            System.out.println("readFile: Null pointer oldu haberin var  mı ?");
            throw eLoc;
        }
        System.out.println("Burayı görcek misin?");
        return null;
    }

    private byte[] readFileInternal() {
        System.out.println("Şu file ı okuyorum : " + this.fileName);
        File fileLoc = new File(this.fileName);
        System.out.println("After exception görecek misin?");
        System.out.println("readFileInternal Burayı görcek misin?");
        return null;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(final String fileNameParam) {
        this.fileName = fileNameParam;
    }

}
