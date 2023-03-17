import java.util.Scanner;

public class zadanie17 {
    public static void main(String[] args) {
        System.out.println("Wprowadź cenę posiłku");
        Scanner klawisz = new Scanner(System.in);
        double cena = klawisz.nextDouble();
        double podatek = cena*0.0675;
        double napiwek = (cena + podatek)*0.2;
        System.out.println("Cena przed podatkiem: " + cena);
        System.out.println("wartość podatku: " + podatek);
        System.out.println("Wysokosc napiwku: " + napiwek);
        System.out.println("Łącznie do zapłaty: " + (cena + podatek+ napiwek));
    }
}
