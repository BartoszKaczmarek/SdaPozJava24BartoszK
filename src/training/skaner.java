package training;

import java.util.Scanner;

public class skaner {

    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj wynagrodzenie brutto:");

                int a;
                double c;
                        a = czytnik.nextInt();

                if(a >= 85000) {
                       c =  a / 1.32;
                } else {
                        c = a / 1.18;
                }


        System.out.println("Wynik: " + c);

    }


}
