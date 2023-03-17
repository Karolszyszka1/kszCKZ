import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) {
        int cookies = 40;
        int nuticionPerPortion = 300;
        int nutricionPerBox = (nuticionPerPortion*10);
        int nutricionPerCookie = (nutricionPerBox/cookies);
        System.out.println("Ile ciastek chcesz zjeść? ");
        Scanner klawisz = new Scanner(System.in);
        cookies = klawisz.nextInt();
        int finalNutricion = cookies*nutricionPerCookie;
        System.out.println("Zjesz w sumie "+ finalNutricion + " Kcal");
    }
}
