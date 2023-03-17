package pdf2;

import java.util.Scanner;

public class liczbyrzymskie {
    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);
        System.out.println("Ilu cyfrową liczbe podajesz?");
        int ileCyfr = klawisz.nextInt();
        klawisz.nextLine();
        System.out.println("Podaj liczbe");
        String liczba = klawisz.nextLine();

        if (ileCyfr==1) {
            for (int i = 0; i <= ileCyfr; i++) {
                if (liczba.charAt(i) == '1') System.out.print("I");
                else if (liczba.charAt(i) == '2') System.out.print("II");
                else if (liczba.charAt(i) == '3') System.out.print("III");
                else if (liczba.charAt(i) == '4') System.out.print("IV");
                else if (liczba.charAt(i) == '5') System.out.print("V");
                else if (liczba.charAt(i) == '6') System.out.print("VI");
                else if (liczba.charAt(i) == '7') System.out.print("VII");
                else if (liczba.charAt(i) == '8') System.out.print("VIII");
                else if (liczba.charAt(i) == '9') System.out.print("IX");
            }
        }else if (ileCyfr==2){

                if (liczba.charAt(0) == '1') System.out.print("X");
                else if (liczba.charAt(0) == '2') System.out.print("XX");
                else if (liczba.charAt(0) == '3') System.out.print("XXX");
                else if (liczba.charAt(0) == '4') System.out.print("XL");
                else if (liczba.charAt(0) == '5') System.out.print("L");
                else if (liczba.charAt(0) == '6') System.out.print("LX");
                else if (liczba.charAt(0) == '7') System.out.print("LXX");
                else if (liczba.charAt(0) == '8') System.out.print("LXXX");
                else if (liczba.charAt(0) == '9') System.out.print("XC");
            for (int i = 1; i <= ileCyfr; i++)  {
                if (liczba.charAt(i) == '1') System.out.print("I");
                else if (liczba.charAt(i) == '2') System.out.print("II");
                else if (liczba.charAt(i) == '3') System.out.print("III");
                else if (liczba.charAt(i) == '4') System.out.print("IV");
                else if (liczba.charAt(i) == '5') System.out.print("V");
                else if (liczba.charAt(i) == '6') System.out.print("VI");
                else if (liczba.charAt(i) == '7') System.out.print("VII");
                else if (liczba.charAt(i) == '8') System.out.print("VIII");
                else if (liczba.charAt(i) == '9') System.out.print("IX");
            }

        }
        else if (ileCyfr==3){

            if (liczba.charAt(0) == '1') System.out.print("C");
            else if (liczba.charAt(0) == '2') System.out.print("CC");
            else if (liczba.charAt(0) == '3') System.out.print("CCC");
            else if (liczba.charAt(0) == '4') System.out.print("CD");
            else if (liczba.charAt(0) == '5') System.out.print("D");
            else if (liczba.charAt(0) == '6') System.out.print("DC");
            else if (liczba.charAt(0) == '7') System.out.print("DCC");
            else if (liczba.charAt(0) == '8') System.out.print("DCCC");
            else if (liczba.charAt(0) == '9') System.out.print("CM");
            if (liczba.charAt(1) == '1') System.out.print("X");
            else if (liczba.charAt(1) == '2') System.out.print("XX");
            else if (liczba.charAt(1) == '3') System.out.print("XXX");
            else if (liczba.charAt(1) == '4') System.out.print("XL");
            else if (liczba.charAt(1) == '5') System.out.print("L");
            else if (liczba.charAt(1) == '6') System.out.print("LX");
            else if (liczba.charAt(1) == '7') System.out.print("LXX");
            else if (liczba.charAt(1) == '8') System.out.print("LXXX");
            else if (liczba.charAt(1) == '9') System.out.print("XC");
            for (int i = 2; i <= ileCyfr; i++)  {
                if (liczba.charAt(i) == '1') System.out.print("I");
                else if (liczba.charAt(i) == '2') System.out.print("II");
                else if (liczba.charAt(i) == '3') System.out.print("III");
                else if (liczba.charAt(i) == '4') System.out.print("IV");
                else if (liczba.charAt(i) == '5') System.out.print("V");
                else if (liczba.charAt(i) == '6') System.out.print("VI");
                else if (liczba.charAt(i) == '7') System.out.print("VII");
                else if (liczba.charAt(i) == '8') System.out.print("VIII");
                else if (liczba.charAt(i) == '9') System.out.print("IX");
            }

        }
        else if (ileCyfr==4){

            if (liczba.charAt(0) == '1') System.out.print("M");
            else if (liczba.charAt(0) == '2') System.out.print("MM");
            else if (liczba.charAt(0) == '3') System.out.print("MMM");

            if (liczba.charAt(1) == '1') System.out.print("C");
            else if (liczba.charAt(1) == '2') System.out.print("CC");
            else if (liczba.charAt(1) == '3') System.out.print("CCC");
            else if (liczba.charAt(1) == '4') System.out.print("CD");
            else if (liczba.charAt(1) == '5') System.out.print("D");
            else if (liczba.charAt(1) == '6') System.out.print("DC");
            else if (liczba.charAt(1) == '7') System.out.print("DCC");
            else if (liczba.charAt(1) == '8') System.out.print("DCCC");
            else if (liczba.charAt(1) == '9') System.out.print("CM");
            if (liczba.charAt(2) == '1') System.out.print("X");
            else if (liczba.charAt(2) == '2') System.out.print("XX");
            else if (liczba.charAt(2) == '3') System.out.print("XXX");
            else if (liczba.charAt(2) == '4') System.out.print("XL");
            else if (liczba.charAt(2) == '5') System.out.print("L");
            else if (liczba.charAt(2) == '6') System.out.print("LX");
            else if (liczba.charAt(2) == '7') System.out.print("LXX");
            else if (liczba.charAt(2) == '8') System.out.print("LXXX");
            else if (liczba.charAt(2) == '9') System.out.print("XC");
            for (int i = 3; i <= ileCyfr; i++)  {
                if (liczba.charAt(i) == '1') System.out.print("I");
                else if (liczba.charAt(i) == '2') System.out.print("II");
                else if (liczba.charAt(i) == '3') System.out.print("III");
                else if (liczba.charAt(i) == '4') System.out.print("IV");
                else if (liczba.charAt(i) == '5') System.out.print("V");
                else if (liczba.charAt(i) == '6') System.out.print("VI");
                else if (liczba.charAt(i) == '7') System.out.print("VII");
                else if (liczba.charAt(i) == '8') System.out.print("VIII");
                else if (liczba.charAt(i) == '9') System.out.print("IX");
            }

        }

    }
}
