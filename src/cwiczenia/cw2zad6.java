package cwiczenia;

import java.util.Random;
import java.util.Scanner;

public class cw2zad6 {
    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);
        int a = 101;
        Random r = new Random();
        int i = r.nextInt(5) + 1;     // metoda bound od zera do podanej wartości

        while(a != i) {
            System.out.println("podaj liczbę");
            a = czytnik.nextInt();

            if (a > i) {
                System.out.println("za duża wartość");
            } else if (a < i) {
                System.out.println("za mała");
            }
        }

        System.out.println("wygrałeś!");
    }

}
