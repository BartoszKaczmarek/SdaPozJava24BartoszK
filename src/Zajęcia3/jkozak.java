package Zajęcia3;

import java.util.Scanner;

public class jkozak {
    /* Napisać program, który pobiera od użytkownika liczbę całkowitą dodatnią, a następnie wyświetla na ekranie
    kolejno wszystkie liczby niepatrzyste nie większe od podanej liczby. Przykład,
    dla 15 program powinien wyświetlić 1, 3, 5, 7, 9, 11, 13, 15.
    */

    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą dodatnią: ");

        int liczba = czytnik.nextInt();

        for (int i = 1; i < liczba; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

// alternatywnie


         }
    }
