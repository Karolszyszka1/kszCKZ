import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        int pomieszczenie1 = (3*4);
        int  pomieszczenie2 = (3*4);
        int  pomieszczenie3 = (2*3);
        int  pomieszczenie4 = (2*2);

        System.out.println("Podaj szerokosc pokoju nr 1 ");
        Scanner klawisz = new Scanner(System.in);
        int szer = klawisz.nextInt();
        System.out.println("Podaj wysokosc pokoju nr 1 ");
        int wys = klawisz.nextInt();
        pomieszczenie1 = (szer * wys);
        klawisz.nextLine();
        System.out.println("Podaj szerokosc pokoju nr 2");
        szer = klawisz.nextInt();
        System.out.println("Podaj wysokosc pokoju nr 2 ");
        wys = klawisz.nextInt();
        pomieszczenie2 = (szer * wys);
        klawisz.nextLine();
        System.out.println("Podaj szerokosc pokoju nr 3");
        szer = klawisz.nextInt();
        System.out.println("Podaj wysokosc pokoju nr 3");
        wys = klawisz.nextInt();
        pomieszczenie3 = (szer * wys);
        klawisz.nextLine();
        System.out.println("Podaj szerokosc pokoju nr 4");
        szer = klawisz.nextInt();
        System.out.println("Podaj wysokosc pokoju nr 4");
        wys = klawisz.nextInt();
        pomieszczenie4 = (szer * wys);
        klawisz.nextLine();

        System.out.println("Powierzchnia pomieszczenia nr 1 wynosi: " + pomieszczenie1 + "m2");
        System.out.println("Powierzchnia pomieszczenia nr 2 wynosi: " + pomieszczenie2 + "m2");
        System.out.println("Powierzchnia pomieszczenia nr 3 wynosi: " + pomieszczenie3 + "m2");
        System.out.println("Powierzchnia pomieszczenia nr 4 wynosi: " + pomieszczenie4 + "m2");
        int powCal = pomieszczenie1 + pomieszczenie2 + pomieszczenie3 + pomieszczenie4;
        System.out.println("Powierzchnia calkowita wynosi: " + powCal + "m2");
        int powNaOs = (powCal/4);
        System.out.println("Powierzchnia na osobe wynosi: " + powNaOs + "m2");
    }
}
