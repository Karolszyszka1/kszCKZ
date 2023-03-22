package pdf2;

import java.util.Scanner;

public class restauracje {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Czy któraś z osób jest na diecie wegetariańskiej?");
        String wegetarian = klawisz.nextLine();
        System.out.println("Czy któraś z osób jest na diecie wegańskiej?");
        String wegan = klawisz.nextLine();
        System.out.println("Czy któraś z osób jest na diecie bezglutenowej?");
        String glutenFree = klawisz.nextLine();
        if (wegetarian.equalsIgnoreCase("tak") && wegan.equalsIgnoreCase("tak") && glutenFree.equalsIgnoreCase("tak")){
            System.out.println("Możesz udać się do :");
            System.out.println("Kawiarnia na rogu");
            System.out.println("Kuchnia u szefa");
        }
        else if (wegetarian.equalsIgnoreCase("tak") && wegan.equalsIgnoreCase("tak") && glutenFree.equalsIgnoreCase("nie")){
            System.out.println("Możesz udać się do :");
            System.out.println("Kawiarnia na rogu");
            System.out.println("Kuchnia u szefa");
        }
        else if (wegetarian.equalsIgnoreCase("tak") && wegan.equalsIgnoreCase("nie") && glutenFree.equalsIgnoreCase("nie")){
            System.out.println("Możesz udać się do :");
            System.out.println("Kawiarnia na rogu");
            System.out.println("Kuchnia u szefa");
            System.out.println("Włoskie specjały");
        }
        else if (wegetarian.equalsIgnoreCase("tak") && wegan.equalsIgnoreCase("nie") && glutenFree.equalsIgnoreCase("tak")){
            System.out.println("Możesz udać się do :");
            System.out.println("Kawiarnia na rogu");
            System.out.println("Kuchnia u szefa");
            System.out.println("Pizzeria przy dworcowej");
        } else if (wegetarian.equalsIgnoreCase("nie") && wegan.equalsIgnoreCase("tak") && glutenFree.equalsIgnoreCase("tak")) {
            System.out.println("Możesz udać się do :");
            System.out.println("Kawiarnia na rogu");
            System.out.println("Kuchnia u szefa");
        }
        else if (wegetarian.equalsIgnoreCase("nie") && wegan.equalsIgnoreCase("tak") && glutenFree.equalsIgnoreCase("nie")){
            System.out.println("Możesz udać się do :");
            System.out.println("Kawiarnia na rogu");
            System.out.println("Kuchnia u szefa");
        }
        else  if (wegetarian.equalsIgnoreCase("nie") && wegan.equalsIgnoreCase("nie") && glutenFree.equalsIgnoreCase("tak")){
            System.out.println("Możesz udać się do :");
            System.out.println("Kawiarnia na rogu");
            System.out.println("Kuchnia u szefa");
            System.out.println("Pizzeria przy dworcowej");
        }
        else if (wegetarian.equalsIgnoreCase("nie") && wegan.equalsIgnoreCase("nie") && glutenFree.equalsIgnoreCase("nie")){
            System.out.println("Możesz udać się do :");
            System.out.println("Kawiarnia na rogu");
            System.out.println("Kuchnia u szefa");
            System.out.println("Pizzeria przy dworcowej");
            System.out.println("Luksusowe Burgery u Jarka");
            System.out.println("Pizzeria przy Dworcowej");
        }
    }
}
