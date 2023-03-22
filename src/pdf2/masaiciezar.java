package pdf2;

import java.util.Scanner;

public class masaiciezar {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj masę obiektu");
        int masa = klawisz.nextInt();
        double ciezar = masa*9.8;
        if (ciezar>1000){
            System.out.println(ciezar + " Niutonów");
            System.out.println("Obiekt jest zbyt ciężki");
        }
        else if (ciezar<10){
            System.out.println(ciezar + " Niutonów");
            System.out.println("Obiekt jest zbyt lekki");
        }
        else {
            System.out.println(ciezar + " Niutonów");
        }
    }
}
