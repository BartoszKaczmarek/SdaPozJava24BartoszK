package zajecia1;

import java.util.Scanner;

public class KonwerterTemp {
    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);

        double stopnieC;



        System.out.println("Jaka jest teperatura w stopniach Celsjusza: ");
        stopnieC = czytnik.nextInt();



        double wynik = stopnieC*1.8 + 32;
        System.out.println(" w stopniach F to: " + wynik);


    }
}
