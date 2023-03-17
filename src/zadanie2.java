import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("17 Marca 2023");

        System.out.println("Podaj imie i nazwisko");
        String ImieNaz = klawisz.nextLine();

        System.out.println("Podaj adres");
        String Adres = klawisz.nextLine();

        System.out.println("Podaj Miasto i kod pocztowy: ");
        String Miasto = klawisz.nextLine();

        System.out.println("Podaj numer telefonu");
        String Telefon = klawisz.nextLine();


        System.out.println("Moje Nazwisko i imie: " + ImieNaz);
        System.out.println("Mój adres: " + Adres);
        System.out.println("Miasto i kod pocztowy"+ Miasto);
        System.out.println("Numer telefonu: "+ Telefon);
    }
}
