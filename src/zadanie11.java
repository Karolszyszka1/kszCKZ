import java.util.Scanner;

public class zadanie11 {
    public static void main(String[] args) {
        System.out.println("Prosze wprowadzić wartość produktu!");
        Scanner klawisz = new Scanner(System.in);
        double price = klawisz.nextDouble();
        double stateTax = 0.04;
        double localTax = 0.02;
        System.out.println("Wartość produktu: "+ price +" zł, podatek lokalny: " + localTax +
                ", podatek stanowy: " + stateTax);
        double finalPrice = (price+ price*stateTax+ price*localTax);
        System.out.println("Cena po podatkach: " + finalPrice);
    }
}
