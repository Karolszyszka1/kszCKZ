package pdf2;

import java.util.Scanner;

public class szybkoscdzw {
    public static void main(String[] args) {
        System.out.println("Wprowadz slowo (powietrze/woda/stal)");
        Scanner klawisz = new Scanner(System.in);
        String material = klawisz.nextLine();
        System.out.println("Podaj odleglosc");
        int odleglosc = klawisz.nextInt();
        double czas = 0.0;
        switch (material){
            case "powietrze":
                czas = 343;
                czas = odleglosc/czas;
                break;
            case "woda":
                czas = 1490;
                czas = odleglosc/czas;
                break;
            case "stal":
                czas = 5100;
                czas = odleglosc/czas;
                break;
        }
        System.out.println("Czas potrzebny na pokonanie takiej odleglosci w" + material +
                " wynosi " + czas + " sek");
    }
}
