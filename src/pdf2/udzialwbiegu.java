package pdf2;

import java.util.Scanner;

public class udzialwbiegu {
    public static void main(String[] args) {


        System.out.println("Podaj nazwisko pierwszego zawodnika");
        Scanner klawisz = new Scanner(System.in);
        String nazwisko1 = klawisz.nextLine();
        System.out.println("Podaj czas pierwszego zawodnika");
        int czas1 = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj nazwisko drugiego zawodnika");
        String nazwisko2 = klawisz.nextLine();
        System.out.println("Podaj czas drugiego zawodnika");
        int czas2 = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj nazwisko trzeciego zawodnika");
        String nazwisko3 = klawisz.nextLine();
        System.out.println("Podaj czas trzeciego zawodnika");
        int czas3 = klawisz.nextInt();
        if (czas1 <=czas2 && czas1 <=czas3){
            System.out.println(nazwisko1);
            if (czas2 <= czas3){
                System.out.println(nazwisko2);
                System.out.println(nazwisko3);
            }
            else{
                System.out.println(nazwisko3);
                System.out.println(nazwisko2);
            }
        }
        else if (czas2 <= czas1 && czas2 <=czas3){
            System.out.println(nazwisko2);
            if (czas1 <= czas3){
                System.out.println(nazwisko1);
                System.out.println(nazwisko3);
            }
            else{
                System.out.println(nazwisko3);
                System.out.println(nazwisko1);
            }
        }
        else if (czas3 <= czas1 && czas3 <=czas2){
            System.out.println(nazwisko3);
            if (czas1 <= czas2){
                System.out.println(nazwisko1);
                System.out.println(nazwisko2);
            }
            else{
                System.out.println(nazwisko2);
                System.out.println(nazwisko1);
            }
        }

    }
}