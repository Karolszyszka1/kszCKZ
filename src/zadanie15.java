import java.util.Scanner;

public class zadanie15 {
    public static void main(String[] args) {
        System.out.println("Podaj cene detaliczna płytek");
        Scanner klawisz = new Scanner(System.in);
        int price = klawisz.nextInt();
        double marza = 0.4;
        double zysk = (price *marza);
        System.out.println("Zysk wynosi: " + zysk + "zł");
    }
}
