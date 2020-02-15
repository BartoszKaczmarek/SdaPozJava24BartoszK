package Cw15luty;
// Napisz program symulujący grę w Lotto:
import java.util.Random;
import java.util.Scanner;

public class Zad1Lotto {
    public static void main(String[] args) {

// pobieranie 6 cyfr
        Scanner sc = new Scanner(System.in);

        Scanner n1 = sc;
        System.out.println("Podaj pierwszą cyfrę:");
        Scanner n2 = sc;
        System.out.println("Podaj drugą cyfrę:");
        Scanner n3 = sc;
        System.out.println("Podaj trzecią cyfrę:");
        Scanner n4 = sc;
        System.out.println("Podaj czwartą cyfrę:");
        Scanner n5 = sc;
        System.out.println("Podaj piątą cyfrę:");
        Scanner n6 = sc;
        System.out.println("Podaj szóstą cyfrę:");


        int[] liczbyUzytkownika = new int[6];

        for (int i =0; i < liczbyUzytkownika.length; i++) {

        }


// losowanie 6 cyfr
        Random rm = new Random();

        for (int i = 1; i < 49; i ++) {
            i = rm.nextInt(49);


        }
    }

}
