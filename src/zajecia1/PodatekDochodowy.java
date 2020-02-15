package zajecia1;

import java.util.Scanner;

public class PodatekDochodowy {

    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);

        double dochód;
        double podatek;
        final double prog_podatkowy = 85_528;
        // próg podatkowy powinien być zablokowaną wartością


        System.out.println("Jaki dochód roczny?: ");
        dochód = czytnik.nextDouble();


        if (dochód <= prog_podatkowy) {
            podatek = dochód * 0.18 - 556.02;

        } else {
            podatek = (dochód - prog_podatkowy) * 0.32 + 14_839.02;

        }
        System.out.println("Należny podatek: " + podatek);

    }

}
