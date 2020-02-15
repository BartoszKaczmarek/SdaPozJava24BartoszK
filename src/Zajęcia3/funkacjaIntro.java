package Zajęcia3;

public class funkacjaIntro {

    // funkcje/metody difiniujemy w ciele KLASY a nie w main
    // funkcje opisujemy czasownikami

    static int dodaj(int a, int b) {
        return a + b;
    }

    // Funkcja która nic nie zwraca ale wypisuje zawartość tablicy
    static void printArray(String[] array) {
        System.out.println("[ ");
        for (String i : array) {
            System.out.print(i + ", ");


        }
    }

        public static void main (String[]args){
            int pierwszaLiczba = 10;

            int drugaLiczba = 20;

            int wynik = dodaj(pierwszaLiczba, drugaLiczba);
            System.out.println("Wynik dodawania to: " + wynik);


        }

    }


