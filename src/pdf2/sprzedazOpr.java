package pdf2;

import java.util.Scanner;

public class sprzedazOpr {
    public static void main(String[] args) {
        System.out.println("Podaj ilość zakupionych pakietów");
        Scanner klawisz = new Scanner(System.in);
        int sztuki = klawisz.nextInt();
        int cenaSzt = 99;
        double rabat = 1.0;
        if (sztuki >= 10 && sztuki <20){
            rabat = 1.2;
            System.out.println("Rabat 20%");
        }
        else if (sztuki >=20 && sztuki<50){
            rabat = 1.3;
            System.out.println("Rabat 30%");
        }
        else if (sztuki >=50 && sztuki <100){
            rabat = 1.4;
            System.out.println("Rabat 40%");
        }
        else if (sztuki >=100) {
            rabat = 1.5;
            System.out.println("Rabat 50%");
        }
        else {
            System.out.println("Brak rabatu");
        }

        double suma = rabat * (sztuki*cenaSzt);
        System.out.println("Łącznie do zapłaty: " + suma + " zł");
    }
}
