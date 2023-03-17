public class zadanie22 {
    public static void main(String[] args) {
        double cenaZak = 32.87*1000;
        double ProwZak = cenaZak*0.02;
        double CenaSprz = 33.92*1000;
        double ProwSprz = CenaSprz*0.02;
        System.out.println("Cena Zakupu bez prowizji: "+ cenaZak);
        System.out.println("Wysokosc prowizji od zakupu: " + ProwZak);
        System.out.println("Kwota otrzymana w wyniku sprzedazy: "+ (CenaSprz - ProwSprz));
        System.out.println("Wysokosc prowizji od sprzedazy: "+ ProwSprz);
        double zysk = (CenaSprz-ProwSprz)-(cenaZak-ProwZak);
        System.out.println("Zysk ze sprzedazy: "+ zysk);
    }
}
