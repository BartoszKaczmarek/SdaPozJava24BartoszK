package cwiczenia;

import java.util.Scanner;

public class BMIcw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int masa;
        double wrost;

        System.out.println("Podaj mase: ");
        masa = sc.nextInt();

        System.out.println("Podaj wrost: ");
        wrost = sc.nextDouble();

        double y;
        y = masa / Math.pow(wrost, 2);

        if (y > 18) {
            System.out.println("Waga za niska");
        } else if (y > 25) {
            System.out.println("Waga w porządku");
        } else if (y <= 25) {
            System.out.println("Waga za wysoka");
        }

    }
}
