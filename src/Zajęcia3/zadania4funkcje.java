package Zajęcia3;

import java.util.Scanner;



public class zadania4funkcje {

    static int countLastLetterInString(String text) {
        // pobieramy ostatnią literę w napisie
        char lastLetter = text.charAt(text.length() - 1);
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char litera = text.charAt(i);
            if (lastLetter == litera) {
                counter++;
                // jeżeli ostatnia litera zgadza się z aktualną to zwiększ licznik

            }
        }
        return counter;
    }

    public static void main(String[] args) {

        System.out.printf("Podaj dowolny napis a ja policzę ilość wystąień ostatniej litery: ");

        Scanner scanner = new Scanner(System.in);

        String napis = scanner.nextLine();

        // wywołujemy funkcję

        int liczbaWystapien = countLastLetterInString(napis);

        System.out.println();
    }


}