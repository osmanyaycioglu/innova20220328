package com.training.java.lab.pizza;


public class Malzeme {

    private final String name;
    private final int    fiyat;

    public Malzeme(final String nameParam,
                   final int fiyatParam) {
        super();
        this.name = nameParam;
        this.fiyat = fiyatParam;
    }

    public String getName() {
        return this.name;
    }

    public int getFiyat() {
        return this.fiyat;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + this.fiyat;
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
        Malzeme other = (Malzeme) obj;
        if (this.fiyat != other.fiyat) {
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


}
