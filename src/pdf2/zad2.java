package pdf2;

import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        System.out.println("Podaj dzień");
        Scanner klawisz = new Scanner(System.in);
        int dzien = klawisz.nextInt();
        System.out.println("Podaj miesiac");
        int miesiac = klawisz.nextInt();
        System.out.println("Podaj dwie ostatnie cyfry roku");
        int rok = klawisz.nextInt();
        int magic = dzien*miesiac;
        if(magic==rok){
            System.out.println("Data jest magiczna");
        }
        else {
            System.out.println("Data nie jest magiczna");
        }
    }
}
