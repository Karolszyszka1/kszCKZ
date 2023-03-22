package pdf2;

import java.util.Scanner;

public class wynikiTestow {
    public static void main(String[] args) {
        System.out.println("Podaj swoje wynki z testu z matematyki: ");
        Scanner klawisz = new Scanner(System.in);
        float matematyka = klawisz.nextInt();
        System.out.println("Podaj swoje wyniki z polskiego");
        float polski = klawisz.nextInt();
        System.out.println("Podaj swoje wyniki z angielskiego ");
        float angielski = klawisz.nextInt();
        double srednia = (matematyka+polski+angielski)/3;

        System.out.println("Twoja średnia wynosi: " + srednia);
        if (srednia <60){
            System.out.println("Twoja ocena to 1!");
        }
        else if (srednia >=60 && srednia<70){
            System.out.println("Twoja ocena to 2!");
        }
        else if (srednia >=70 && srednia<80){
            System.out.println("Twoja ocena to 3!");
        }
        else if (srednia >=80 && srednia<90){
            System.out.println("Twoja ocena to 4!");
        }
        else if (srednia >=90 && srednia<=100){
            System.out.println("Twoja ocena to 5");
        }
        else System.out.println("Błędne dane");
    }

}
