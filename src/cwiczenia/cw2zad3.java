package cwiczenia;

import java.util.Scanner;

public class cw2zad3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Podaj liczbę 'n'");
        int n = sc.nextInt();

        for (int i = 0; Math.pow(2, i) <= n; i++) {
            System.out.print(Math.pow(2, i) + ", ");


        }
    }
}