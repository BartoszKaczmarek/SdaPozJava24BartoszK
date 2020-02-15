package zajecia1;

import java.util.Scanner;

public class LiczbyNieparzyste {
    public static void main(String[] args) {
        //Parzyste liczby wersja 1
        System.out.println("Parzyste liczby od 0 do 100 - pętla for - wersja 1 ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }

        }
        //Parzyste liczby wersja 2
        System.out.println("Parzyste liczby - wersja 2");

        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i + ",");
        }


        System.out.println("Parzyste liczby od 100 do 0 - pętla for - wersja 1 ");
        for (int i = 100; i <= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + ",");

            }
        }

        int suma = 0;
        for(int i = 0; i < 100; i++) {
            suma += i;
            //alternatywnie: suma = suma + i
        }
        System.out.println();
        System.out.println("Suma liczb od 0 do 100: " + suma);
    }

}