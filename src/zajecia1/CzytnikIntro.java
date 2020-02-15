package zajecia1;

import java.util.Scanner;

public class CzytnikIntro {
    public static void main(String[] args) {
        //aby otrzymac dane od użytkownika musimy utworzyć obiekt Scanner według skałdni:
        Scanner czytnik = new Scanner(System.in);

        // czytnik to zmienna / obiekt typu scanner

        // wiek to zmienna int
        // w momencie pisnaia nie znamy wieku więc 0
        String imie;
        double wiek = 0;

        System.out.println("Podaj swoje imie: ");
        imie = czytnik.nextLine();

        System.out.println("Witaj " + imie + "!");

        //Wiek to inny rodzaj zmiennej niż imie dlatego Int a nie Line; podanie liczby
        //innej niż całkowita spowoduje bład
        System.out.println("Ile masz lat? ");
        wiek = czytnik.nextDouble();

        System.out.println("Witaj " + imie + "! Masz " + wiek + " lat ");

    }
}
