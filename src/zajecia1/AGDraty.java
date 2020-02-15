package zajecia1;

import java.util.Scanner;

public class AGDraty {

    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);

                double cena_towaru;
                int liczba_rat;


        System.out.println("Cena sprzętu?: ");
        cena_towaru = czytnik.nextDouble();

        System.out.println("Okres kredytowania?: ");
        liczba_rat = czytnik.nextInt();

        double miesięczna_rata=0;
        if( (cena_towaru >= 100 && cena_towaru <= 10_000) && (liczba_rat >= 6 && liczba_rat <= 48)) {
            System.out.println("Obliczamy raty...");
            if (liczba_rat >= 6 && liczba_rat <= 12) {
                miesięczna_rata = 1.025 * cena_towaru / liczba_rat;
            } else if (liczba_rat <= 24) {
                miesięczna_rata = 1.05 * cena_towaru / liczba_rat;
            } else  {
                miesięczna_rata = 1.1 * cena_towaru / liczba_rat;
            }
            System.out.println("Miesięczna rata wynosi: " + miesięczna_rata);
        } else {
            System.out.println("Złe dane wejściowe ");
        }



    }



}
