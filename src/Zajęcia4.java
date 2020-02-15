import java.util.Random;
import java.util.Scanner;

public class Zajęcia4 {
    public static void main(String[] args) {

        Random rand = new Random(); // losowaie liczb

        // int losowaLiczba = rand.nextInt(10); // zakres 0-9
        int losowaLiczba = rand.nextInt(10) + 1;
        System.out.println(losowaLiczba);

        // tworzymy 2 tablice
        // pierwsza "liczby" o rozmiarze podanym przez użytkownika
        // druga tabica "wystąpienia" o rozmiarze 11 dla zliczania

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int arraySize = scanner.nextInt();


        // tablica "Liczby"
        int[] liczby = new int[arraySize];
        int[] wystapienia = new int[11];

        for (int i = 0; i < liczby.length; i++) {
            // losujemy liczbę
            int randomNumber = rand.nextInt(10) + 1;
            // wpisujemy wylosowaną liczbę w tablicy
            liczby[i] = randomNumber;
        }

        // mamy wypełnioną tablicę "liczby", więc ją wyświetlamy

        for (int liczba : liczby) {
            System.out.print(liczba + ", ");
        }

        // zliczanie elementów
        for (int i = 0; i < liczby.length; i++) {
            // pobierz wartość z tablicy liczby  >> wartość ta jest indeksem dla "wystąpienia"
            // np. jesli będzie liczba 5 to w tablicy wystapienia [5] należy inkrementować wartosc


        int index = liczby[i];     // index to komórka w tabeli
        wystapienia[index]++;
    }
        // wyświetlenie tablicy wystąpienia

        for (int i = 0; i < wystapienia.length; i++) {
            System.out.println(i + "--> " + wystapienia[i]);
        }
    }
}
