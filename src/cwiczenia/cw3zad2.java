package cwiczenia;

import java.sql.Array;
import java.util.Random;

public class cw3zad2 {
    public static void main(String[] args) {

        Random r = new Random();

        int [] a = new int[20];

        for (int i = 0; i < 20; i++) {
            a[i] = r.nextInt(9) + 1;
        }

        for (int j = 1; j <= 10; j++ ) {            // sprawdza wartości z tablicy z przdziału 1-10
            int k = 0;
            for (int s = 0; s < 20; s++) {           // iteruje po komórkach tablicy
                if (a [s] == j) {                    // spisuje powtórzenia liczb
                    k++;
                }
            }
            System.out.println("Liczba " + j + "  pojawia się " + k);
        }

    }
}
