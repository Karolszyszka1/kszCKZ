package pdf2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class operatorTelefonii {
    public static void main(String[] args) {
        System.out.println("Wybierz swoj pakiet:");
        System.out.println("A " + " B "+ " C");
        Scanner klawisz = new Scanner(System.in);
        String pakiet = klawisz.nextLine();
        System.out.println("Ile minut rozmawiales");
        int iloscMin = klawisz.nextInt();
        double cenaA= 39.99;
        double cenaB= 59.99;
        double cenaC= 69.99;
        double cena= 0.0;
        double osczednosc =0.0;
        int DarmoweMinuty = 0;
        double CenaZaMin = 0.0;

        switch (pakiet){
            case "A":
                DarmoweMinuty =450;
                CenaZaMin = 0.45;
                if (iloscMin > DarmoweMinuty){
                    iloscMin = iloscMin - DarmoweMinuty;
                }else {
                    iloscMin=0;
                }
                cena = cenaA + iloscMin*CenaZaMin;
                     BigDecimal bd = new BigDecimal(cena).setScale(2, RoundingMode.HALF_UP);
                     double cenaZaokroglona = bd.doubleValue();
                System.out.println("Łącznie musisz zaplacic: " + cenaZaokroglona + " zł");

                if (cena>=cenaB){
                    osczednosc = cena-cenaB;
                             BigDecimal cd = new BigDecimal(osczednosc).setScale(2, RoundingMode.HALF_UP);
                             double OszczednoscZaokroglona = cd.doubleValue();
                    System.out.println("Kupując pakiet B oszczedziłbyś " + OszczednoscZaokroglona);
                }
                break;
            case "B":
                DarmoweMinuty =900;
                CenaZaMin = 0.40;
                if (iloscMin > DarmoweMinuty){
                    iloscMin = iloscMin - DarmoweMinuty;
                }else {
                    iloscMin=0;
                }
                cena = cenaB + iloscMin*CenaZaMin;
                     BigDecimal cd = new BigDecimal(cena).setScale(2, RoundingMode.HALF_UP);
                        double cenaZaokroglona2 = cd.doubleValue();
                System.out.println("Łącznie musisz zaplacic: " + cenaZaokroglona2 + " zł");
                if (cena>=cenaC){
                    osczednosc = cena-cenaC;
                            BigDecimal rd = new BigDecimal(osczednosc).setScale(2, RoundingMode.HALF_UP);
                             double OszczednoscZaokroglona2 = rd.doubleValue();
                    System.out.println("Kupując pakiet C oszczedziłbyś " + OszczednoscZaokroglona2);
                }

                break;
            case "C":
                cena = 69.99;
                System.out.println("Łącznie musisz zaplacic: " + cena + " zł");
                break;
        }


    }
}
