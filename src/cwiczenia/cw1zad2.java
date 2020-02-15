package cwiczenia;

import java.util.Scanner;

public class cw1zad2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę cłkowitą większą od zera");

        int liczba = sc.nextInt();

        for (int i = 1; i <= liczba; i ++) {
            if (i % 2 == 1); {       // % reszta z dzielenia
                System.out.println(i); }
            }


        }

    }
