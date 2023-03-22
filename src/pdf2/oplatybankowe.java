package pdf2;

import java.util.Scanner;

public class oplatybankowe {
    public static void main(String[] args) {
        System.out.println("Ile czeków wystawiono w tym miesiacu");
        Scanner klawisz  = new Scanner(System.in);
            int ileCzek = klawisz.nextInt();
            double cenazaCzek = 0.0;
            if (ileCzek <20){
                cenazaCzek =0.1;
            }
            else if (ileCzek <40){
                cenazaCzek = 0.08;
            } else if (ileCzek<60) {
                cenazaCzek = 0.06;
            }
            else {
                cenazaCzek = 0.04;
            }
            double podstawowa = 10;
        double suma = podstawowa +ileCzek*cenazaCzek;
        System.out.println("Oplaty pobrane w tym miesiacu wynoszą " + suma + " zł");
    }
}
