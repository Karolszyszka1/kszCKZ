package pdf2;

import java.util.Scanner;

public class klubksiazki {

    public static void main(String[] args) {
        System.out.println("Ile książek kupiles w ostatnim miesiącu ");
        Scanner klawisz = new Scanner(System.in);
        int ileKsiaz = klawisz.nextInt();
        int punkty = 0;
        if (ileKsiaz == 0){
            punkty+=0;
        }
        else if (ileKsiaz==1){
            punkty += 5;
        } else if (ileKsiaz==2) {
            punkty += 15;
        } else if (ileKsiaz==3) {
            punkty+=30;
        } else if (ileKsiaz>=4) {
            punkty+=60;
        }
        System.out.println("Otrzymałeś " + punkty+ " punktów");
    }
}
