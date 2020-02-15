import java.util.Scanner;

public class Zajęcia3 {
    public static void main(String[] args) {
        /* Napisać program zliczający długość łańcucha znakowego
        ●Z białymi znakami
        ●Bez białych znaków

        użycie pętli do pominięcia spacji, dlatego, żę imię jest obiektm typu string
        obiekt typu string udostepnia konkretne operacje które można wykonać
         */

        Scanner czytnik = new Scanner(System.in);
        System.out.println("Wpisz dowolny napis");
        String text = czytnik.nextLine();

        // zliczanie liczby znaków w napisie
        int licznik = 0;
        for (int i = 0; i < text.length(); i++) {
            // pobierz 1 znak
            char znak = text.charAt(i);
            // jeżeli dany znak jest literą to go zliczamy
            if (znak != ' ') {
                licznik++;
            }
        }

        System.out.println("Długość tekstu ze spacjami: " + text.length());
        System.out.println("Długość tekstu bez spacji to: " + licznik);

        // wyświetl tekst napisany wielkimi i małymi literami
        System.out.println("Tekst mayłymi literami to: " + text.toUpperCase());
        System.out.println("Małe litery: " + text.toLowerCase());

    }
}
