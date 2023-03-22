package pdf2;

import java.util.Scanner;

public class kalorieztluszczu {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe kalorii produktu ");
        Scanner klawisz  = new Scanner(System.in);
        double kalorie = klawisz.nextDouble();
        System.out.println("Podaj liczbe gramow tluszczu");
        double tluszcz = klawisz.nextDouble();
        double ileKalwTluszczu = tluszcz*9;
        double kalZTluszczu = ileKalwTluszczu/kalorie;
        if (kalZTluszczu < 0.3){
            System.out.println(kalZTluszczu*100 + " %");
            System.out.println("Produkt jest niskotłuszczowy");
        }
        else if (ileKalwTluszczu > kalorie){
            System.out.println("Dane wejsciowe są nieprawidłowe");
        }
        else {
            System.out.println(kalZTluszczu*100 + " %");
        }
    }
}
