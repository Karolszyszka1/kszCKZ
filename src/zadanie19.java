public class zadanie19 {
    public static void main(String[] args) {
        int LiczAnk = 12467;
        double LiczKupJedTyg = LiczAnk*0.14;
        double LiczPrefCytr = LiczKupJedTyg*0.64;
        System.out.println("Liczba ankietowanych: " + LiczAnk);
        System.out.println("Liczba Kupujących co najmniej jeden energetyk tygodniowo: "+ LiczKupJedTyg );
        System.out.println("Liczba preferujących smaki cytrusowe: " + LiczPrefCytr);
    }
}
