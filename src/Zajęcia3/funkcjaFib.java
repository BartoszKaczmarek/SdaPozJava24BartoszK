package Zajęcia3;

public class funkcjaFib {

    static int fibonaci(int n) {
        int fib1 = 1;
        int fib2 = 1;

        int suma = 0;
        System.out.println("fib1 = " + fib1);
        System.out.println("fib2 = " + fib2);
        for (int i = 3; i <= n; i++) {
            suma = fib1 + fib2; // obliczanie kolejnego obrazu
            fib1 = fib2;
            fib2 = suma;

        }
        return suma;
    }


    }



