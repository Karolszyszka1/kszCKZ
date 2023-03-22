package pdf2;

import java.util.Scanner;

public class oplaty {
    public static void main(String[] args) {

        System.out.println("wprowadz wagę przesyłki");
        Scanner klawisz = new Scanner(System.in);
        int waga = klawisz.nextInt();
        System.out.println("Wprowadz odległość");
        int odleglosc = klawisz.nextInt();
        double cenazaWag = 0.0;

        if (waga <=1){
            cenazaWag = 1.1;
        }
        else if (waga <=3){
            cenazaWag = 2.2;
        }
        else if (waga <=5){
            cenazaWag = 3.7;
        }
        else {
            cenazaWag = 3.8;
        }
        int odl = 0;
        while (odleglosc >0){
                odl++;
                odleglosc-=500;
        }
        double suma = odl*cenazaWag;
        System.out.println(suma + " zł");



    }
}
