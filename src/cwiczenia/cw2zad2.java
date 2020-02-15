package cwiczenia;

import java.util.Scanner;

public class cw2zad2 {

    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);

        System.out.println("Podaj liczbę A: ");
        int a = czytnik.nextInt();
        System.out.println("Podaj liczbę B");
        int b = czytnik.nextInt();

        if (a < b) {
//            int suma = 0;
//            for (int i = a; i <= b; i ++) {
//                suma += i;
//            }
//
//            System.out.println("Suma przedziału od a=" + a + " do b=" + b + " wynosi: " + suma);

            int suma = a;                  // na wejściu musimy być wartość a
            int licznik = a;

           do {
               licznik ++;
               suma += licznik;             // jest równe temu co już mamy i licznik
           }
            while (licznik < b);

            System.out.println(suma);



 //           int suma = a;                  // na wejściu musimy być wartość a
   //         int licznik = a;


                            // jest równe temu co już mamy i licznik

//            while (licznik < b) {
//                licznik ++;
//                suma += licznik;
//            }
//
//            System.out.println(suma);




        }


    }

}
