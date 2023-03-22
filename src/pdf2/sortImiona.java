package pdf2;

import java.util.Scanner;

public class sortImiona {
    public static void main(String[] args) {
        System.out.println("Podaj pierwsze imie");
        Scanner klawisz = new Scanner(System.in);
        String imie1 = klawisz.nextLine();
        System.out.println("Podaj drugie ime");
        String imie2 = klawisz.nextLine();
        System.out.println("Podaj trzecie imie");
        String imie3 = klawisz.nextLine();
        if(imie3.compareToIgnoreCase(imie1) <=0 && imie3.compareToIgnoreCase(imie2) <=0){
            System.out.println(imie3);
            if (imie1.compareToIgnoreCase(imie2) <0){
                System.out.println(imie1);
                System.out.println(imie2);
            }
            else{
                System.out.println(imie2);
                System.out.println(imie1);
            }
        }


        else if (imie1.compareToIgnoreCase(imie2) < 0){
            System.out.println(imie1);
            if (imie2.compareToIgnoreCase(imie3) <0){
                System.out.println(imie2);
                System.out.println(imie3);
            }
            else {
                System.out.println(imie3);
                System.out.println(imie2);
            }
        }

        else if (imie1.compareTo(imie2) == 0) {

            System.out.println(imie1);
            if (imie2.compareToIgnoreCase(imie3) <0){
                System.out.println(imie2);
                System.out.println(imie3);
            }
            else {
                System.out.println(imie3);
                System.out.println(imie2);
            }
        }
        else if (imie1.compareTo(imie2) > 0){
            System.out.println(imie2);
            if (imie1.compareToIgnoreCase(imie3) <0){
                System.out.println(imie1);
                System.out.println(imie3);
            }
            else {
                System.out.println(imie3);
                System.out.println(imie1);
            }
        }
    }
}
