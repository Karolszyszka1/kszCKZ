import java.util.Scanner;

public class zadanie14 {
    public static void main(String[] args) {
        System.out.println("Podaj swoje wynki z testu z matematyki: ");
       Scanner klawisz = new Scanner(System.in);
        float matematyka = klawisz.nextInt();
        System.out.println("Podaj swoje wyniki z polskiego");
        float polski = klawisz.nextInt();
        System.out.println("Podaj swoje wyniki z angielskiego ");
        float angielski = klawisz.nextInt();
        double srednia = (matematyka+polski+angielski)/3;
        System.out.println("Twoje oceny to: ");
        System.out.println("Matematyka: " + matematyka);
        System.out.println("Polski: "+ polski);
        System.out.println("Angielski: " + angielski);
        System.out.println("Twoja średnia wynosi: " + srednia);
    }
}
