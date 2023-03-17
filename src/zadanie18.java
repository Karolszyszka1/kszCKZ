public class zadanie18 {
    public static void main(String[] args) {
        int aukcje = 600;
        double cena = 21.77;
        double prowizja = 0.02;
        double zakup = aukcje*cena;
        double WysPro = zakup*prowizja;
        System.out.println("Kwota przed prowizją: " + zakup);
        System.out.println("Kwota po prowizji: " + WysPro);
        System.out.println("Łączna kwota: "+ (zakup+ WysPro));
    }
}
