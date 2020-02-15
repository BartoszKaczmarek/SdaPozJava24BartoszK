package Zajęcia3;

import java.util.Scanner;

public class Arrays {
    // http://www.jkozak.pl/przedmioty/java/zadania3.pdf
    public static void main(String[] args) {
        int wiek = 10;

                String imie = "Piotr";

        // tablica o  10 komórkch
        int[] liczby = new int[10];

        //wpisywanie wartości do tablicy
        liczby[0] = 25;
        liczby[4] = 100;

        // pobieranie wartości z tablicy
        int wartosc = liczby[4];

        System.out.println(wartosc);     //indeks tablicy nigdy nie będzie ujemny
        System.out.println(liczby[0]);

        int dlugoscTablicy = liczby.length;
        System.out.println("Tablica ma długość: " + dlugoscTablicy);


        String[] imiona = {"Ala", "Piotr", "Adam", "Eliza"};
        System.out.println("Długosć tablicy: " + imiona.length);

        for (int i = 0; i < imiona.length; i++) {

            String name = imiona[i];
            System.out.println("Imie nr. " + i + " to: " + name);

        //Dynamiczne tworzenie tablicy
        System.out.println("podaj rozmiar tablicy: ");
        Scanner scanner = new Scanner(System.in);
        int rozmiar = scanner.nextInt();

        int[] dynamicznaTablica = new int[rozmiar];

        System.out.println("Rozmiar dynamicznej tablicy: " + dynamicznaTablica.length);

        }
    }
}
