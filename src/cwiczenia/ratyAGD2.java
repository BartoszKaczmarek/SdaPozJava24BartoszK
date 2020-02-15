package cwiczenia;

import java.util.Scanner;

public class ratyAGD2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double cenaProduktu;
        int ileRat;

        System.out.println("Cena produktu");
        cenaProduktu = sc.nextDouble();

        System.out.println("Ile rat");
        ileRat = sc.nextInt();

        double rata_miesieczna=0;

        if ((cenaProduktu >= 100 && cenaProduktu <= 10000) && (ileRat >= 6 && ileRat <= 48)) {
            if (ileRat >= 6 && ileRat <= 12) {
                rata_miesieczna = cenaProduktu * 1.025 / ileRat;
            } else if (ileRat <= 24) {
                rata_miesieczna = cenaProduktu * 1.05 / ileRat;
            } else {
                rata_miesieczna = cenaProduktu * 1.01 / ileRat;
            }
            System.out.println("Rata wynosi " + rata_miesieczna);
        } else {
            System.out.println("Złe dane wejściowe");
        }


    }
}
