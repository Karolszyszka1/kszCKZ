import java.util.Scanner;

public class zadanie21 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj kwote ktora deponujesz");
        double kwota = klawisz.nextDouble();
        klawisz.nextLine();
        System.out.println("Podaj roczna stope oprocentowania");
        double stopa = klawisz.nextDouble();
        klawisz.nextLine();
        System.out.println("Ile razy srodki sa kapitalizowane");
        int kapitalizacja = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Ile lat srodki beda na koncie");
        int lata = klawisz.nextInt();
        double wynik = kwota*Math.pow((1+stopa/kapitalizacja), (kapitalizacja*lata));
        System.out.println("Na twoim koncie będzie: " + wynik);
    }
}
