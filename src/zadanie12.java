import java.util.Scanner;

public class zadanie12 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe przejechanych kilometrów: ");
        Scanner klawisz = new Scanner(System.in);
        int distance = klawisz.nextInt();
        System.out.println("Podaj ile litrów paliwa spaliłeś: ");
        int fuel = klawisz.nextInt();
        double fuelPerDistance = (distance/fuel);
        System.out.println("Twoj samochod przejedzie: " + fuelPerDistance + " Kilometrów na litrze");
    }
        }
