package pdf2;

import java.util.Scanner;

public class indeksBMI {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj swoją mase ciałą");
        double masa = klawisz.nextDouble();
        System.out.println("Podaj swój wzrost");
        double wzrost = klawisz.nextDouble();
        double bmi = masa/Math.pow(wzrost, 2);

        if (bmi<18.5){
            System.out.println("Masz niedowagę");
        }
        else if (bmi>=18.5 && bmi<=25){
            System.out.println("Masz prawidłową wagę");
        }
        else {
            System.out.println("Możesz mieć nadwagę");
        }
    }
}
