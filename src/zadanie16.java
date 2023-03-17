import java.util.Scanner;

public class zadanie16 {
    public static void main(String[] args) {
        System.out.println("Podaj swoje ulubione miasto");
        Scanner klawisz = new Scanner(System.in);
        String miasto = klawisz.nextLine();

        String duze =  miasto.toUpperCase();
        String male = miasto.toLowerCase();
        int dlugosc = miasto.length();
        char znak = miasto.charAt(0);

        System.out.println("Liczba znaków w słowie: " + dlugosc);
        System.out.println("Nazwa Duzymi: "+ duze);
        System.out.println("Nazwa Malymi: "+ male);
        System.out.println("Pierwsza litera: "+ znak);
    }
}
