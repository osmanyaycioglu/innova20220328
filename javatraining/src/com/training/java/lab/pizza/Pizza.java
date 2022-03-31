package com.training.java.lab.pizza;

import java.util.Arrays;

public class Pizza {

    private final int       fiyat;
    private final String    pizzaTipi;
    private final Malzeme[] malzemeler;
    private int             malzemeArrayIndex = 0;


    public Pizza(final int maxMalzemeSayisi,
                 final int fiyat,
                 final String pizzaTipi) {
        this.malzemeler = new Malzeme[maxMalzemeSayisi];
        this.fiyat = fiyat;
        this.pizzaTipi = pizzaTipi;
    }

    public Pizza malzemeEkle(final String malzeme) {
        if (this.malzemeler.length > this.malzemeArrayIndex) {
            switch (malzeme) {
                case "zeytin":
                    this.malzemeler[this.malzemeArrayIndex] = new Malzeme(malzeme,
                                                                          5);
                    break;
                case "sucuk":
                    this.malzemeler[this.malzemeArrayIndex] = new Malzeme(malzeme,
                                                                          10);
                    break;
                case "misir":
                    this.malzemeler[this.malzemeArrayIndex] = new Malzeme(malzeme,
                                                                          5);
                    break;
                case "sosis":
                    this.malzemeler[this.malzemeArrayIndex] = new Malzeme(malzeme,
                                                                          8);
                    break;
                case "mantar":
                    this.malzemeler[this.malzemeArrayIndex] = new Malzeme(malzeme,
                                                                          6);
                    break;
                case "peynir":
                    this.malzemeler[this.malzemeArrayIndex] = new Malzeme(malzeme,
                                                                          5);
                    break;
                case "domates":
                    this.malzemeler[this.malzemeArrayIndex] = new Malzeme(malzeme,
                                                                          4);
                    break;
                case "biber":
                    this.malzemeler[this.malzemeArrayIndex] = new Malzeme(malzeme,
                                                                          8);
                    break;
                case "yesil zeytin":
                    this.malzemeler[this.malzemeArrayIndex] = new Malzeme(malzeme,
                                                                          5);
                    break;
                default:
                    return this;
            }

            this.malzemeArrayIndex++;
            return this;
        }
        return this;
    }

    public int fiyat() {
        int toplamFiyat = this.fiyat;
        for (int iLoc = 0; iLoc < this.malzemeler.length; iLoc++) {
            Malzeme malzemeLoc = this.malzemeler[iLoc];
            if (malzemeLoc != null) {
                toplamFiyat += malzemeLoc.getFiyat();
            } else {
                break;
            }
        }
        return toplamFiyat;
    }

    public String aciklama() {
        StringBuilder sb = new StringBuilder(50);
        sb.append(this.pizzaTipi);
        sb.append(" ");
        sb.append(" pizza ismarladiniz. İçindekiler : \n");
        for (int iLoc = 0; iLoc < this.malzemeler.length; iLoc++) {
            Malzeme malzemeLoc = this.malzemeler[iLoc];
            if (malzemeLoc != null) {
                sb.append("\t");
                sb.append(malzemeLoc.getName());
                sb.append(" ");
                sb.append(malzemeLoc.getFiyat());
                sb.append(" TL\n");
            } else {
                break;
            }
        }
        sb.append("Toplam fiyat : " + this.fiyat());
        return sb.toString();
    }

    @Override
    public String toString() {
        return this.aciklama();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + this.fiyat;
        result = (prime * result) + this.malzemeArrayIndex;
        result = (prime * result) + Arrays.hashCode(this.malzemeler);
        result = (prime * result) + ((this.pizzaTipi == null) ? 0 : this.pizzaTipi.hashCode());
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
        Pizza other = (Pizza) obj;
        if (this.fiyat != other.fiyat) {
            return false;
        }
        if (this.malzemeArrayIndex != other.malzemeArrayIndex) {
            return false;
        }
        if (!Arrays.equals(this.malzemeler,
                           other.malzemeler)) {
            return false;
        }
        if (this.pizzaTipi == null) {
            if (other.pizzaTipi != null) {
                return false;
            }
        } else if (!this.pizzaTipi.equals(other.pizzaTipi)) {
            return false;
        }
        return true;
    }


}
