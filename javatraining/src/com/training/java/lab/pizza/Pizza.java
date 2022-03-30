package com.training.java.lab.pizza;


public class Pizza {

    private int       fiyat;
    private String    pizzaTipi;
    private Malzeme[] malzemeler;
    private int       malzemeArrayIndex = 0;


    public Pizza(int maxMalzemeSayisi,
                 int fiyat,
                 String pizzaTipi) {
        malzemeler = new Malzeme[maxMalzemeSayisi];
        this.fiyat = fiyat;
        this.pizzaTipi = pizzaTipi;
    }

    public boolean malzemeEkle(String malzeme) {
        if (malzemeler.length > malzemeArrayIndex) {
            switch (malzeme) {
                case "zeytin":
                    malzemeler[malzemeArrayIndex] = new Malzeme(malzeme, 5);
                    break;
                case "sucuk":
                    malzemeler[malzemeArrayIndex] = new Malzeme(malzeme, 10);
                    break;
                case "misir":
                    malzemeler[malzemeArrayIndex] = new Malzeme(malzeme, 5);
                    break;
                case "sosis":
                    malzemeler[malzemeArrayIndex] = new Malzeme(malzeme, 8);
                    break;
                case "mantar":
                    malzemeler[malzemeArrayIndex] = new Malzeme(malzeme, 6);
                    break;
                case "peynir":
                    malzemeler[malzemeArrayIndex] = new Malzeme(malzeme, 5);
                    break;
                case "domates":
                    malzemeler[malzemeArrayIndex] = new Malzeme(malzeme, 4);
                    break;
                case "biber":
                    malzemeler[malzemeArrayIndex] = new Malzeme(malzeme, 8);
                    break;
                case "yesil zeytin":
                    malzemeler[malzemeArrayIndex] = new Malzeme(malzeme, 5);
                    break;
                default:
                    return false;
            }
            
            malzemeArrayIndex++;
            return true;
        }
        return false;
    }

    public int fiyat() {
        int toplamFiyat = fiyat;
        for (int iLoc = 0; iLoc < malzemeler.length; iLoc++) {
            Malzeme malzemeLoc = malzemeler[iLoc];
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
        sb.append(pizzaTipi);
        sb.append(" ");
        sb.append(" pizza ismarladiniz. İçindekiler : \n");
        for (int iLoc = 0; iLoc < malzemeler.length; iLoc++) {
            Malzeme malzemeLoc = malzemeler[iLoc];
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
        sb.append("Toplam fiyat : " + fiyat());
        return sb.toString();
    }
}
