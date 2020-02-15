package Zajęcia3;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = sc.nextInt();

        int fib1 = 1;
        int fib2 = 1;

        int suma = 0;
        System.out.println("fib1 = " + fib1);
        System.out.println("fib2 = " + fib2);
            for (int i = 3; i <= n; i++) {
                suma = fib1 + fib2; // obliczanie kolejnego obrazu
                fib1 = fib2;
                fib2 = suma;
                System.out.println("fib(" + i +") = " + suma);
            }

        }

    }


