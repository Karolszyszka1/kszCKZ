import java.util.Scanner;

public class zadanie23 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj dlugosc rzedu");
        int dlugoscRzedu = klawisz.nextInt();
        System.out.println("Ile miejsca zajmą kraty");
        int objKrat = klawisz.nextInt();
        System.out.println("Podaj odległości między sadzonkami");
        int odleglosc = klawisz.nextInt();
        int liczSadzonek =(dlugoscRzedu-2*objKrat)/odleglosc;
        System.out.println("W rzedzie zmieszcza sie "+ liczSadzonek+" sadzonki");
    }
}
