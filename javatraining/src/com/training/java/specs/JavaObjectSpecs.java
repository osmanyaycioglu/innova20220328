package com.training.java.specs;


public class JavaObjectSpecs {

    private String name;
    private int    max;
    private int    min;


    @Override
    public String toString() {
        return "JavaObjectSpecs [name=" + this.name + ", max=" + this.max + ", min=" + this.min + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + this.max;
        result = (prime * result) + this.min;
        result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
        return result;
    }


    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        JavaObjectSpecs other = (JavaObjectSpecs) obj;
        if (this.max != other.max) {
            return false;
        }
        if (this.min != other.min) {
            return false;
        }
        if (this.name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!this.name.equals(other.name)) {
            return false;
        }
        return true;
    }


    public static void main(final String[] args) {
        JavaObjectSpecs objectSpecs = new JavaObjectSpecs();
        objectSpecs.name = "test";
        objectSpecs.max = 100;
        objectSpecs.min = 10;
        JavaObjectSpecs objectSpecsOther = new JavaObjectSpecs();
        objectSpecsOther.name = "test";
        objectSpecsOther.max = 100;
        objectSpecsOther.min = 10;
        if (objectSpecs.equals(objectSpecsOther)) {
            System.out.println("Heyoo ikisi aynı");
        }
        System.out.println("tostring : " + objectSpecs);
        String stringLoc = new String("osman");
        System.out.println("Yaratılan string : " + stringLoc);
        if (stringLoc.equals("osman")) {
            System.out.println("İki string eşit");
        }
    }
}
