package zajecia1;

import java.io.PrintStream;

public class LoopIntro {

    public static void main(String[] args) {

        // prosta pętla WHILE z wypisywaniem wartości od 0 do 9

        int wiek = 20;
        System.out.println(wiek);

        // dodanie do wartości wiek wartości 5 - zwiększenie wartości zmiennej
        wiek = wiek + 5;
        System.out.println(wiek);

        // 2 sposób na zwiększenie wartości zmiennej
        wiek += 7;
        System.out.println(wiek);

        // 3 sposób ++
        wiek++;
        System.out.println(wiek);

        // post vs pre inkrementacja
        int number = 20;

        System.out.println("Postinkrementacja: ++number");

        System.out.println(number++);
        System.out.println(number);

        System.out.println("Preinkrementacja: ++number");

        System.out.println(++number);
        System.out.println(number);

        // PĘTLA wypisująca liczby 0-9 - pętla może się wykonać 0 razy jeśli taka będzie instrukcja
        int licznik = 0;
        while (licznik < 10) {
            System.out.println(licznik);
            licznik++;


            System.out.println("Pętla do while");
            int x = 20;

        }

        int x = 0;
        do {
            System.out.print(x++);
        } while (x < 10);

    }


}
