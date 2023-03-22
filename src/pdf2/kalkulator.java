package pdf2;

import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe sekund");
        Scanner klawisz = new Scanner(System.in);
        int sek = klawisz.nextInt();
        int  min =0;
        int godz = 0;
        int dzien = 0;
        while (sek > 0) {
            if (sek >=86400){
                dzien++;
                sek -=86400;
            }
            if (sek >= 3600) {
                godz++;
                sek -= 3600;
            }
            if (sek >= 60) {
                min++;
                sek -= 60;
            }
            sek--;
        }
        System.out.println(dzien + " dni " + godz + " godzin " + min + " minut");
    }
}
