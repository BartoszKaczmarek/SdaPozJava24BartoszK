package Zajęcia3;

import java.util.Scanner;

public class jkozakZadanie2 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę A: ");
        int a = sc.nextInt();
        System.out.println("Podaj liczbę B: ");
        int b = sc.nextInt();

        if (a < b) {
            int suma = 0;
            for (int i = a; i <= b; i++) {
                suma += i;
            }

            System.out.println("Suma przedziału od a=" + a + " do b=" + b + " wynosi: " + suma);

            // pętla while
            suma = 0;
            int index = a;
            while (index <= b) {
                suma += index;
                index++;

                System.out.println("Suma przedziału od a=" + a + " do b=" + b + "wynosi:" + suma);

            }

        } else {
            System.out.println("A musi być mniejze od B");
        }


    }


}
