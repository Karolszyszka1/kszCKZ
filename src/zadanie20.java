import java.util.Scanner;

public class zadanie20 {
    public static void main(String[] args) {
        System.out.println("Ile ciastek chcesz upiec?");
        Scanner klawisz = new Scanner(System.in);
        int ilosc = klawisz.nextInt();
        double skladnikCukier = 1.5/48;
        double skladnikMaslo = 1.0/48;
        double skladnikMaka = 2.75/48;
        System.out.println("Do upieczenia "+ ilosc+ " ciastek potrzebujesz:");
        double ileCukru = ilosc*skladnikCukier;
        double ileMasla = ilosc*skladnikMaslo;
        double ileMaki = ilosc* skladnikMaka;
        System.out.println(ileCukru+ " szklanek cukru");
        System.out.println(ileMasla+ " szklanek masla");
        System.out.println(ileMaki+ " szklanek maki");
    }
}
