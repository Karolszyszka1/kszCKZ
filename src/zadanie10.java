import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj Imie: ");
        String firstName = klawisz.nextLine();
        char firstInitial = firstName.charAt(0);
        System.out.println("Podaj Drugie imie");
        String middleName = klawisz.nextLine();
        char middleInitial = middleName.charAt(0);
        System.out.println("Podaj Nazwisko: ");
        String lastName = klawisz.nextLine();
        char lastInitial = lastName.charAt(0);
        System.out.println("Imie: "+ firstName);
        System.out.println("Drugie Imie: "+ middleName);
        System.out.println("Nazwisko: " + lastName);


        System.out.println("Inicjał Imienia: "+ firstInitial);
        System.out.println("Inicjał drugiego imienia: "+ middleInitial);
        System.out.println("Inicjał Nazwiska: " + lastInitial);
    }
}
